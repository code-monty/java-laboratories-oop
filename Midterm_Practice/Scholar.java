package Midterm_Practice;

public class Scholar extends Student {
    private String scholar1;
    private String scholar2;

    Scholar(String name, String gender, int ylevel, String university, String scholar1){
        super(name, gender, ylevel, university);
        this.scholar1 = scholar1;
    }

    public void setScholar1(String scholar1){
        this.scholar1 = scholar1;
    }

    public void setScholar2(String scholar2) {
        this.scholar2 = scholar2;
    }

    public String getScholar1() {
        return scholar1;
    }

    public String getScholar2() {
        return scholar2;
    }

}
