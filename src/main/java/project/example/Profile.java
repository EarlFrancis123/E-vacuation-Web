package project.example;

public class Profile extends ExampleSupport {
    public String execute() {

        String[] sentences = {
            "This is news sample 1.",
            "This is news sample 2.",
            "This is news sample 3.",
            "This is news sample 4.",
            "This is news sample 5."
        };
        int randomNum = (int) (Math.random() * 5);

        setSentence(sentences[randomNum]);

        return SUCCESS;
    }

    private String sentence;

    public String getSentence() {
        return sentence;
    }
    
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
