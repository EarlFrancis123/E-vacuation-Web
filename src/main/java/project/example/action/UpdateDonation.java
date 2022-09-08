package project.example.action;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import java.sql.Connection;                
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.opensymphony.xwork2.ActionSupport;
import project.example.model.Donation;
import project.example.model.Evacuation;
public class UpdateDonation extends ActionSupport {
    public ArrayList evacuations = new ArrayList();
    private int iddonations;
    private Donation donationBean;
    Statement statement = null;
    public String execute() {
        donationBean = getDonationBean();
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

                    Donation donation = new Donation();
                    donation.setIddonations(iddonations);

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
   
 
    public Statement getStatement() {
        return statement;
    }
    public Donation getDonationBean() {
        return donationBean;
    }
    public void setDonationBean(Donation donationBean) {
        this.donationBean = donationBean;
    }
    public void setStatement(Statement statement) {
        this.statement = statement;
    }
    public int getIddonations() {
        return iddonations;
    }
    public void setIddonations(int iddonations) {
        this.iddonations = iddonations;
    }
   
   
    


   
}
