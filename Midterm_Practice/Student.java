package Midterm_Practice;

public class Student {
    private String name;
    private String gender;
    private int ylevel;
    private String university;

    Student(String name, String gender, int ylevel, String university) {
        this.name = name;
        this.gender = gender;
        this.ylevel = ylevel;
        this.university = university;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getYlevel() {
        return ylevel;
    }
    public String getUniversity() {
        return university;
    }

}
