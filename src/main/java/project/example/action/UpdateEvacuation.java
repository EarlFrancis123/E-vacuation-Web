package project.example.action;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import java.sql.Connection;                
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.opensymphony.xwork2.ActionSupport;
import project.example.model.Evacuee;
import project.example.model.Evacuation;
public class UpdateEvacuation extends ActionSupport {
    public ArrayList evacuations = new ArrayList();
    private int idevacuation;
    private Evacuation evacuationBean;
    Statement statement = null;
    public String execute() {
        evacuationBean = getEvacuationBean();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");
            
            if (connection != null) {
                String sql = "SELECT * FROM evacuation";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){  
                    Evacuation evacuation=new Evacuation();
                    evacuation.setIdevacuation(idevacuation);

                }
            } 
        
         } catch (Exception e) {

         } 
         
         
         
         finally {
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }

         return SUCCESS;
                
  

    }
    public ArrayList getEvacuations() {
        return evacuations;
    }
    public void setEvacuations(ArrayList evacuations) {
        this.evacuations = evacuations;
    }
 
    public int getIdevacuation() {
        return idevacuation;
    }
    public void setIdevacuation(int idevacuation) {
        this.idevacuation = idevacuation;
    }
    public Evacuation getEvacuationBean() {
        return evacuationBean;
    }
    public void setEvacuationBean(Evacuation evacuationBean) {
        this.evacuationBean = evacuationBean;
    }
    public Statement getStatement() {
        return statement;
    }
    public void setStatement(Statement statement) {
        this.statement = statement;
    }
   
   
    


   
}
