package project.example.action;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import java.sql.Connection;                
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import project.example.model.Donation;

public class SearchDonation extends ActionSupport {
    private String search;
    ArrayList<Donation> donations = new ArrayList<Donation>();
    public ArrayList listOfFirstNames = new ArrayList();
    public ArrayList<Donation> getDonation(){  
        return donations;  
    }  
    public void setList(ArrayList<Donation> donations) {  
        this.donations = donations;  
    }  

    public String execute() throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");

            if (connection != null) {
                String sql = "select * From donations where sponsor='"+getSearch()+"'" ;
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){  
                    Donation donation=new Donation();
                    donation.setWater(rs.getString(2));   
                    donation.setFood(rs.getString(3)); 
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
    public String displayUser() {   
        return SUCCESS;
    }
    public ArrayList<Donation> getDonations() {
        return donations;
    }
    public void setDonations(ArrayList<Donation> donations) {
        this.donations = donations;
    }
    public ArrayList getListOfFirstNames() {
        return listOfFirstNames;
    }
    public void setListOfFirstNames(ArrayList listOfFirstNames) {
        this.listOfFirstNames = listOfFirstNames;
    }
    public String getSearch() {
        return search;
    }
    public void setSearch(String search) {
        this.search = search;
    }
    
    
}
