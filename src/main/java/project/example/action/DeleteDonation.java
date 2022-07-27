
package project.example.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;


import java.sql.ResultSet;

import project.example.model.Donation;
public class DeleteDonation extends ActionSupport {
    private int iddonations;
    private int search;
    private String error;
    ArrayList<Donation> donations = new ArrayList<Donation>();
    public ArrayList listOfFirstNames = new ArrayList();
    public ArrayList<Donation> getDonation(){  
        return donations;  
    }  
    public void setList(ArrayList<Donation> donations) {  
        this.donations = donations;  
    }  
    public String execute() throws Exception{
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");
       
    
            try {
      
    
                statement = connection.createStatement();
                String sql = "DELETE FROM donations\n" + 
                "WHERE (iddonations ='"+iddonations+"')";
                statement.executeUpdate(sql);
             } catch (Exception e){
                
             }

             
            if (connection != null) {
                String sql = "SELECT * FROM donations";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){  
                    Donation donation=new Donation();
                    donation.setIddonations(rs.getInt(1));   
                    donation.setWater(rs.getString(3));   
                    donation.setFood(rs.getString(8)); 
                    donation.setMedicine(rs.getString(4));
                    donation.setClothes(rs.getString(5));; 
                    donation.setSponsor(rs.getString(6));;
                    donation.setEvacuationName(rs.getString(7));; 
           
                    donations.add(donation);  
                    listOfFirstNames.add(donation.getSponsor());
                }
            } 
         } catch (Exception e) {

         } finally {
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }

         return SUCCESS;
    }
    public int getSearch() {
        return search;
    }

    public void setSearch(int search) {
        this.search = search;
    }





    public String getError() {
        return error;
    }


    public void setError(String error) {
        this.error = error;
    }
    public int getIddonations() {
        return iddonations;
    }
    public void setIddonations(int iddonations) {
        this.iddonations = iddonations;
    }
 

   
}
