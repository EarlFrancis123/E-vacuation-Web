package project.example.action;
import project.example.model.Person;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LoginB extends ExampleSupport {

    private Person personBean;
    public String encryptedText;
    public String token;

    public String execute() throws Exception{
        personBean = getPersonBean();
        personBean.setPassword(encryptPass(personBean.getPassword()));
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
       public String encryptPass(String text){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");  
            /* digest() method called to calculate message digest of ’text’ and return array of byte */  
            byte[] hash = md.digest(text.getBytes(StandardCharsets.UTF_8));  
            /* The bytes array has bytes in decimal form. Convert it into hexadecimal format. */  
            StringBuilder s = new StringBuilder();  
            for(int i=0; i<  hash.length; i++)  
            {  
                    s.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));  
            }  
            /* Complete hashed text in hexadecimal format */  
            encryptedText = s.toString();  
          
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return encryptedText;
    }
    public String authlogin() throws Exception {
        if(token != null) {
            return "success";
        } else {
            return "fail";
        }
    }
    
}