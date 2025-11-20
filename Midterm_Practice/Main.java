package Midterm_Practice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Courses courses = new Courses("Angelo", "Male", 1, "CVSU");
        Scholar scholar = new Scholar("Alexis", "Female", 1, "CVSU", "DOST");
        
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("===== STUDENT INFO =====");
        System.out.println("Name: " + courses.getName());
        System.out.println("Gender: " + courses.getGender());
        System.out.println("Year Level: " + courses.getYlevel() +"st");
        System.out.println(" University: " + courses.getUniversity());
        System.out.println("==========================");
        System.out.print("What is your course: ");
            String course = input.next();
            String course2 = courses.setCourse(course);
        System.out.println("Course: " + course2);
            System.out.println(courses.ifCourse(course));

            System.out.print("What is your first scholarship: ");
                String scholar1 = input.next();
                    scholar.setScholar1(scholar1);
                System.out.print("What is your second scholarship: ");
                String scholar2 = input.next();
                    scholar.setScholar2(scholar2); 

                System.out.println("First Scholarship: " + scholar.getScholar1());
                System.out.println("Second scholarship: " + scholar.getScholar2());




    }
}
