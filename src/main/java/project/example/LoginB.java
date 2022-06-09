package project.example;
import project.example.model.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LoginB extends ExampleSupport {
    private String error = "Random";
    private Person personBean;

    public String execute() throws Exception{
        personBean = getPersonBean();
        if(validate(personBean.getEmail(), personBean.getPassword())){  
          
            return "success";  
        }  
        else{  
            return "input";  
        } 
    }
    public Person getPersonBean() {
        return personBean;
    }
    
    public void setPersonBean(Person person) {
        personBean = person;
    }

  
    public static boolean validate(String email,String password){  
        boolean status=false;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC","root","Loveleycute30");  
            PreparedStatement ps=con.prepareStatement(  
            "select * from persons where email=? and password=?");  
            ps.setString(1,email);  
            ps.setString(2,password);  
            ResultSet rs=ps.executeQuery();  
            status=rs.next(); 
        }catch(Exception e){e.printStackTrace();}  
        return status;  
       }
    
}