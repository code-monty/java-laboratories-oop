package Laboratories;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Book book = new Book("Fundamentals of Programming","Mir Shehzad Ahmad",2024,"English","Non-Fiction",224,"1st Edition",
         "9781779561695", "00085585", "available");

        System.out.println("=== WELCOME TO LIBRARY! ===");
        book.displayBook();    
        
        System.out.print("Enter your Student Id: ");      
        String id = input.nextLine();
        book.setStudentID(id);

        if (book.getStatus() == "available") {
            book.ReadandSetStatus();
                    }
    }
}
