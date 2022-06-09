package project.example.rest;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


import project.example.model.Person;


public class AccountsRepository {
    private static Map<String, Person> map = new HashMap<String, Person>();
    Connection connection = null;
    PreparedStatement preparedStatement = null;
   
    public AccountsRepository(){
      
    }
    
    public Map<String, Person> findAllAccounts() throws SQLException{
        connectToDb();
        if (connection != null) {
            String sql = "SELECT * FROM persons";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet rs= preparedStatement.executeQuery();

            while(rs.next()){  
                Person person=new Person();
                person.setPassword(rs.getString(5));
                person.setLastName(rs.getString(7));   
                person.setFirstName(rs.getString(6)); 
                person.setEmail(rs.getString(9));
                person.setAge(rs.getInt(8)); 
                map.put(rs.getString(1), person);  
            }
        } 
        return map;
    }


   /*POST SAVE TO DB */
    public Map<String, Person> save(Person account) throws Exception{
        connection = connectToDb();
        if (connection != null) {
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO persons(password,first_name, last_name, age, email) VALUES('"+account.getPassword()+"','"+account.getFirstName()+"','"+account.getLastName()+"','"+account.getAge()+"','"+account.getEmail()+"')";
            statement.executeUpdate(sql);
            statement.close();
            connection.close();
        } 
        return map;
    }

    public Person getAccountById(String id) {
        return map.get(id);
    }

   public Connection connectToDb(){
    try {
        String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(URL, "root", "Loveleycute30");
     } catch (Exception e) {

     } 
    return connection;
   }
}