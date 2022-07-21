
package project.example.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import project.example.model.Evacuee;
import project.example.model.Evacuation;
public class AddEvacuee extends ExampleSupport {
    private static final long serialVersionUID = 1L;
    
    private Evacuee evacueeBean;
    private String error = "Random";
    String encryptedText;
    Evacuation evacuation=new Evacuation();

    public String execute() throws Exception {
        evacueeBean = getEvacueeBean();
     
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");
            
            if (connection != null) {
                String sql = "SELECT idevacuation from evacuation where (evacuationName = '"+evacueeBean.getEvacuationName()+"')";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){  
               
                    evacuation.setEvacuationName(rs.getString(1));   
                   
                }
            } 
         } catch (Exception e) {

         }
        if(saveToDB()) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public boolean saveToDB() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");



            
            if (connection != null) {
                statement = connection.createStatement();
                String sql = "INSERT INTO evacuee(idevacuation,first_name, last_name, contactNumber,gender,address,evacuatioName) VALUES('"+evacuation.getEvacuationName()+"','"+evacueeBean.getFirstName()+"','"+evacueeBean.getLastname()+"','"+evacueeBean.getContactNumber()+"','"+evacueeBean.getGender()+"','"+evacueeBean.getAddress()+"','"+evacueeBean.getEvacuationName()+"')";
                statement.executeUpdate(sql);
                return true;
            } else {
                error = "DB connection failed";
                return false;
            }
         } catch (Exception e) {
             error = e.toString();
             return false;  
         } finally {
            if (statement != null) try { statement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }
    }

  
    public Evacuee getEvacueeBean() {
        return evacueeBean;
    }

    public void setEvacueeBean(Evacuee evacueeBean) {
        this.evacueeBean = evacueeBean;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }



    
   
}
