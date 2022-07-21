package project.example.action;

public class Profile extends ExampleSupport {
    private String  token;
    public String execute() {

        if(token != null) {
            return "success";
        } else {
            return "fail";
        }

    }

    private String sentence;

    public String getSentence() {
        return sentence;
    }
    
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
}
