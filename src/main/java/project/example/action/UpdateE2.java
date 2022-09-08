
package project.example.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;


import java.sql.ResultSet;

import project.example.model.Evacuation;
public class UpdateE2 extends ActionSupport {
    private int idevacuation;
    private int search;
    private String error;
    public ArrayList evacuations = new ArrayList();
    private Evacuation evacuationBean;
    public String execute() throws Exception{
        evacuationBean = getEvacuationBean();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");
       
    
            try {

                statement = connection.createStatement();
                String sql1 = "UPDATE evacuation\n" + 
                "SET evacuationName = " + "'" + evacuationBean.getEvacuationName() + "'," +
                "evacuationNumber = " + "'" + evacuationBean.getEvacuationNumber()+ "'," +
                "evacuationAddress = " + "'" + evacuationBean.getEvacuationAddress() + "'," +
                "evacuationCapacity = " + "'" + evacuationBean.getEvacuationCapacity() + "'," +
                "evacuationBarangay = " + "'" + evacuationBean.getEvacuationBarangay()+ "'\n" +
                "WHERE ( idevacuation = '" + 5 +"')";
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


   
}
