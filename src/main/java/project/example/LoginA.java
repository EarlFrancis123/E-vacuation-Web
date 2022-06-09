package project.example;

public class LoginA extends ExampleSupport {
    public String execute() { 

        Account[] accounts = new Account[3]; 
        
        accounts[0] = new Account("EarlFrancis", "123", "John", "Doe", "January 1, 2000", "Admin",
        "John Doe is from Canada. He is studying Math Education at Utah State. He currently works as an author.");
        accounts[1] = new Account("JungieGerez", "1234", "Jane", "Doe", "February 1, 2000", "Regular",
        "Jane Doe is from Maine. She is studying Entrepreneurship at UVU. She currently works as a manager at a local restaurant.");
        accounts[2] = new Account("IanPelayo", "12345", "Jimmy", "Doe", "March 1, 2000", "Regular", 
        "Jimmy Doe is from Texas. He is studying Anthropology at BYU. He currently works as a salesperson.");

        if(username.isBlank() && password.isBlank()){
            if(!submit.isEmpty()) {
                loginMessage = "Please enter username and password";
            }

            username = ""; //reset in case username is just spaces
        }else if(username.isBlank()) {
            loginMessage = "Please enter a username";
        }else if(password.isBlank()) {
            loginMessage = "Please enter a password";
        }else {
            // if(checkFromMockDatabase(username, password, accounts)) {
            //     return "regular";
            // }
            int userIndex = checkMatchingAccountIndex(username, password, accounts);
            if(userIndex != -1) {
                activeAccount = accounts[userIndex];
                return activeAccount.getType();
            }
            else {
                loginMessage = "Invalid username or password";
            } 
        }

        return SUCCESS;
    }

    private String username = "";
    private String password = "";
    private String loginMessage = "";
    private Account activeAccount;
    private String submit = "";

    public int checkMatchingAccountIndex(String user, String pass, Account[] accounts) {
        int matchingIndex = -1;

        for(int x = 0; x < accounts.length; x++) {
            if(accounts[x].accountCheck(user, pass)){
                matchingIndex = x;
                break;
            }
        }
        return matchingIndex;
    }

    // public boolean checkFromMockDatabase(String user, String pass) {
    //     String[] accountsUser = {"user_one", "user_two", "user_three"};
    //     String[] accountsPass = {"pass1", "pass2", "pass3"};

    //     for(int x = 0; x < accountsUser.length; x++) {
    //         if(accountsUser[x].equals(user) && accountsPass[x].equals(pass)) {
    //             return true;
    //         }
    //     }

    //     return false;
    // }

    
    public String getLoginMessage() {
        return loginMessage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoginMessage(String loginMessage) {
        this.loginMessage = loginMessage;
    }

    public Account getActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(Account activeAccount) {
        this.activeAccount = activeAccount;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }
}