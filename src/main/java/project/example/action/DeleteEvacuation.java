
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
public class DeleteEvacuation extends ActionSupport {
    private int idevacuation;
    private int search;
    private String Status = "Suspended";
    private String error;
    ArrayList<Evacuation> evacuations = new ArrayList<Evacuation>();
    public ArrayList listOfFirstNames = new ArrayList();
    public ArrayList<Evacuation> getEvacuations() {  
        return evacuations;  
    }  
    public void setList(ArrayList<Evacuation> evacuations) {  
        this.evacuations = evacuations;  
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
                String sql1 = "UPDATE evacuation SET evacuationStatus = '"+Status+"' WHERE idevacuation = '"+idevacuation+"'";
                statement.execute(sql1);
             } catch (Exception e){
                
             }

             
             if (connection != null) {
                String sql = "SELECT * FROM evacuation";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){  
                    Evacuation evacuation=new Evacuation();
                    evacuation.setIdevacuation(rs.getInt(1));   
                    evacuation.setEvacuationName(rs.getString(2));   
                    evacuation.setEvacuationNumber(rs.getString(3)); 
                    evacuation.setEvacuationAddress(rs.getString(4));
                    evacuation.setEvacuationBarangay(rs.getString(4));
                    evacuation.setEvacuationCapacity(rs.getString(5));
                    evacuation.setEvacuationStatus(rs.getString(6));; 
                    evacuations.add(evacuation);  
                    listOfFirstNames.add(evacuation.getEvacuationName());
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
    public int getIdevacuation() {
        return idevacuation;
    }
    public void setIdevacuation(int idevacuation) {
        this.idevacuation = idevacuation;
    }

  


   
}
