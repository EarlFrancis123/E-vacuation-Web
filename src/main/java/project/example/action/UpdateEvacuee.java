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
public class UpdateEvacuee extends ActionSupport {
    public ArrayList evacuations = new ArrayList();
    private int idevacuee;
    private Evacuee evacueeBean;
    Statement statement = null;
    public String execute() {
        evacueeBean = getEvacueeBean();
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
                    evacuation.setEvacuationName(rs.getString(2));   
                    evacuations.add(evacuation.getEvacuationName());
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
    public int getIdevacuee() {
        return idevacuee;
    }
    public void setIdevacuee(int idevacuee) {
        this.idevacuee = idevacuee;
    }
    public Evacuee getEvacueeBean() {
        return evacueeBean;
    }
    public void setEvacueeBean(Evacuee evacueeBean) {
        this.evacueeBean = evacueeBean;
    }
   
    


   
}
