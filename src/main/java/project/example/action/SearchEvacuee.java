package project.example.action;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import java.sql.Connection;                
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import project.example.model.Evacuee;

public class SearchEvacuee extends ActionSupport {
    private String search;
    ArrayList<Evacuee> evacuees = new ArrayList<Evacuee>();
    public ArrayList listOfFirstNames = new ArrayList();
    public ArrayList<Evacuee> getEvacuees() {  
        return evacuees;  
    }  
    public void setList(ArrayList<Evacuee> evacuees) {  
        this.evacuees = evacuees;  
    }  

    public String execute() throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");

            if (connection != null) {
                String sql = "select * From evacuee where first_name='"+getSearch()+"'" ;
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){  
                    Evacuee evacuee=new Evacuee();
                    evacuee.setFirstName(rs.getString(2));   
                    evacuee.setLastname(rs.getString(3)); 
                    evacuee.setContactNumber(rs.getString(4));
                    evacuee.setGender(rs.getString(5));; 
                    evacuee.setAddress(rs.getString(6));; 
                    evacuee.setEvacuationName(rs.getString(7));; 
                    evacuees.add(evacuee);  
                    listOfFirstNames.add(evacuee.getFirstName());
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
    public String getSearch() {
        return search;
    }
    public void setSearch(String search) {
        this.search = search;
    }
    
    
}
