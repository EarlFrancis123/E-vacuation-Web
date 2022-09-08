
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
public class UpdateD extends ActionSupport {
    private int iddonations;
    private int search;
    private String error;
    public ArrayList evacuations = new ArrayList();
    private Donation donationBean;
    public String execute() throws Exception{
        donationBean = getDonationBean();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");
       
    
            try {

                statement = connection.createStatement();
                String sql1 = "UPDATE donations\n" + 
                "SET water = " + "'" + donationBean.getWater() + "'," +
                "food = " + "'" + donationBean.getFood() + "'," +
                "medicine = " + "'" + donationBean.getMedicine() + "'," +
                "clothes = " + "'" +donationBean.getClothes()+ "'," +
                "sponsor = " + "'" + donationBean.getSponsor() + "'," +
                "evacuationName = " + "'" + donationBean.getEvacuationName()+ "'\n" +
                "WHERE ( iddonations = '" + 6 +"')";
                statement.executeUpdate(sql1);
             } catch (Exception e){
                
             }

             
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

    public ArrayList getEvacuations() {
        return evacuations;
    }

    public void setEvacuations(ArrayList evacuations) {
        this.evacuations = evacuations;
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

    public Donation getDonationBean() {
        return donationBean;
    }

    public void setDonationBean(Donation donationBean) {
        this.donationBean = donationBean;
    }



   
}
