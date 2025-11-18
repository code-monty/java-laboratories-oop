package Laboratories;
import java.util.Scanner;

public class encap {
    private String name;
    private int age;
    private String place;

   encap(String name, int age, String place) {
    this.setName(name);
    this.setAge(age);
    this.setPlace(place);
   } 
   Scanner input = new Scanner(System.in);

   public String getName() {
    return name;
   }

   public int getAge() {
    return age;
   }

   public String getPlace() {
    return place;
   }

   public void setName(String name) {
    System.out.print("Enter your name: ");
        String name1 = input.next();
        name = name1;
    this.name = name;
    System.out.println("My name:"+ name);
   }

   public void setAge(int age) {
    this.age = age;
   }

   public void setPlace (String place) {
    this.place = place;
   }

}
