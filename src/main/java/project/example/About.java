package project.example;

public class About extends ExampleSupport {
    public String execute() {

        String[] sentences = {
            "This is sample 1.",
            "This is sample 2.",
            "This is sample 3.",
            "This is sample 4.",
            "This is sample 5."
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
