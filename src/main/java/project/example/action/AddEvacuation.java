package project.example.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import project.example.model.Evacuation;
public class AddEvacuation extends ExampleSupport {
    private static final long serialVersionUID = 1L;
    
    private Evacuation evacuationBean;
    private String error = "Random";
    String encryptedText;


    public String execute() throws Exception {
        evacuationBean = getEvacuationBean() ;
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
                String sql = "INSERT INTO evacuation(evacuationName, evacuationNumber, evacuationAddress,evacuationBarangay,evacuationCapacity) VALUES('"+evacuationBean.getEvacuationName()+"','"+evacuationBean.getEvacuationNumber()+"','"+evacuationBean.getEvacuationAddress()+"','"+evacuationBean.getEvacuationAddress()+"','"+evacuationBean.getEvacuationCapacity()+"')";
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

  
  

    public Evacuation getEvacuationBean() {
        return evacuationBean;
    }

    public void setEvacuationBean(Evacuation evacuationBean) {
        this.evacuationBean = evacuationBean;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }



    
   
}
