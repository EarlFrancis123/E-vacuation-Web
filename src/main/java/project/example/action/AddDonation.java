package project.example.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import project.example.model.Donation;
public class AddDonation extends ExampleSupport {
    private static final long serialVersionUID = 1L;
    
    private Donation donationBean;
    private String error = "Random";
    String encryptedText;
    Donation donation=new Donation();

    public String execute() throws Exception {
        donationBean = getDonationBean() ;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");
            
            if (connection != null) {
                String sql = "SELECT idevacuation from evacuation where (evacuationName = '"+donationBean.getEvacuationName()+"')";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){  
               
                    donation.setEvacuationName(rs.getString(1));   
                   
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
                String sql = "INSERT INTO donations(idevacuation,water, food, medicine,clothes,sponsor,evacuationName) VALUES('"+donation.getEvacuationName()+"','"+donationBean.getWater()+"','"+donationBean.getFood()+"','"+donationBean.getMedicine()+"','"+donationBean.getClothes()+"','"+donationBean.getSponsor()+"','"+donationBean.getEvacuationName()+"')";
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

  
  

 
    public Donation getDonationBean() {
        return donationBean;
    }

    public void setDonationBean(Donation donationBean) {
        this.donationBean = donationBean;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }



    
   
}
