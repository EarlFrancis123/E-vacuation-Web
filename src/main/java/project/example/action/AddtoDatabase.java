package project.example.action;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import project.example.model.Person;

public class AddtoDatabase extends ExampleSupport {
    private static final long serialVersionUID = 1L;
    
    private Person personBean;
    private String error = "Random";
    String encryptedText;


    public String execute() throws Exception {
        personBean = getPersonBean();
        if(saveToDB()) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public boolean saveToDB() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "Loveleycute30");

            if (connection != null) {
                statement = connection.createStatement();
                personBean.setPassword(encryptPass(personBean.getPassword()));
                String sql = "INSERT INTO persons(first_name, last_name, age,email,password) VALUES('"+personBean.getFirstName()+"','"+personBean.getLastName()+"','"+personBean.getAge()+"','"+personBean.getEmail()+"','"+personBean.getPassword()+"')";
                statement.executeUpdate(sql);
                return true;
            } else {
                error = "DB connection failed";
                return false;
            }
         } catch (Exception e) {
             error = e.toString();
             return false;  
         } finally {
            if (statement != null) try { statement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }
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
    
    public String getError() {
        return error;
    }
    
    public Person getPersonBean() {
        return personBean;
    }
    
    public void setPersonBean(Person person) {
        personBean = person;
    }

}