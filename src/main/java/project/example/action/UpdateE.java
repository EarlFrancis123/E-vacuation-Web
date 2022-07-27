
package project.example.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;


import java.sql.ResultSet;

import project.example.model.Evacuee;
public class UpdateE extends ActionSupport {
    private int idevacuee;
    private int search;
    private String error;
    public ArrayList evacuations = new ArrayList();
    private Evacuee evacueeBean;
    public String execute() throws Exception{
        evacueeBean = getEvacueeBean();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");
       
    
            try {

                statement = connection.createStatement();
                String sql1 = "UPDATE evacuee" + 
                "SET first_name = " + "'" + evacueeBean.getFirstName() + "'," +
                "last_name = " + "'" + evacueeBean.getLastname() + "'," +
                "contactNumber = " + "'" + evacueeBean.getContactNumber() + "'," +
                "gender = " + "'" + evacueeBean.getGender() + "'," +
                "address = " + "'" + evacueeBean.getAddress() + "'," +
                "evacuatioName = " + "'" + evacueeBean.getEvacuationName() + "'\n" +
                "WHERE ( idevacuee = '" + idevacuee +"')";
                statement.execute(sql1);
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
    public int getIdevacuee() {
        return idevacuee;
    }
    public void setIdevacuee(int idevacuee) {
        this.idevacuee = idevacuee;
    }


   
}
