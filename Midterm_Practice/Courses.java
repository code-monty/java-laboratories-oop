package Midterm_Practice;

public class Courses extends Student {
    private String course;

    Courses(String name, String gender, int ylevel,String university) {
        super(name,gender, ylevel,university);
    }

    public String setCourse(String course) {
        this.course = course;
        return course;
    }

    public String ifCourse (String course) {
        if (course != null && course.equalsIgnoreCase(course)) {
            return "You are a Tiger!";
        }
        else {
            return "You are not a Tiger";
        }
    }

    
}
