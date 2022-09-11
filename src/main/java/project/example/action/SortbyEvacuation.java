package project.example.action;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import org.apache.struts2.components.Else;

import java.sql.Connection;                
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import project.example.model.Evacuation;

public class SortbyEvacuation extends ActionSupport {
    private String evacuationInput;
    ArrayList<Evacuation> evacuations = new ArrayList<Evacuation>();
    public ArrayList listOfFirstNames = new ArrayList();
    public ArrayList<Evacuation> getEvacuations() {  
        return evacuations;  
    }  
    public void setList(ArrayList<Evacuation> evacuations) {  
        this.evacuations = evacuations;  
    }  

    public String execute() throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");

            if (connection != null) {
                String sql = "select * From evacuation where evacuationBarangay='"+getEvacuationInput()+"'" ;
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();
                while(rs.next()){  
                    Evacuation evacuation=new Evacuation();
                    evacuation.setEvacuationName(rs.getString(2));   
                    evacuation.setEvacuationNumber(rs.getString(3));    
                    evacuation.setEvacuationAddress(rs.getString(7));
                    evacuation.setEvacuationBarangay(rs.getString(4));; 
                    evacuation.setEvacuationCapacity(rs.getString(5));; 
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
    public String displayUser() {   
        return SUCCESS;
    }
    public String getEvacuationInput() {
        return evacuationInput;
    }
    public void setEvacuationInput(String evacuationInput) {
        this.evacuationInput = evacuationInput;
    }
    public void setEvacuations(ArrayList<Evacuation> evacuations) {
        this.evacuations = evacuations;
    }
    public ArrayList getListOfFirstNames() {
        return listOfFirstNames;
    }
    public void setListOfFirstNames(ArrayList listOfFirstNames) {
        this.listOfFirstNames = listOfFirstNames;
    }
    
    
}
