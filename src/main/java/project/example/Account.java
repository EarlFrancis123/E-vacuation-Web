package project.example;

public class Account {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String birthday;
    private String type;
    private String bio;
    
    public Account(String username, String password, String firstname, String lastname, String birthday, String type,
            String bio) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.type = type;
        this.bio = bio;
    }

    public boolean accountCheck(String loginUser, String loginPassword) {
        if(username.equals(loginUser) && password.equals(loginPassword)) {
            return true;
        }
        
        return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}
