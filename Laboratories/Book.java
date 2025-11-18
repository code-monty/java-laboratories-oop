package Laboratories;
import java.util.Scanner;
public class Book {
    private String title; private String author;
    private int date;  private String language;
    private String type;
    private int pages;
    private String edition; 
    private String ISBN;
    private String barcode;
    private String status;
    private String id;

    Book(String title, String author, int date, 
    String language, String type, int pages, String edition, String ISBN,String barcode, String status) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.language = language;
        this.type = type;
        this.pages = pages;
        this.edition = edition;
        this.ISBN = ISBN;
        this.barcode = barcode;
        this.status = status;
    }
    Scanner input = new Scanner(System.in);

   //Read
   public String getTitle() {
    return title;
   }
   
    public String getAuthor() {
        return author;
    }
    public int getDate() {
        return date;
    }
    public String getLanguage() {
        return language;
    }
    public String getType() {
        return type;
    }
    
    public int getPages() {
        return pages;
    }
    public String getEdition () {
        return edition;
    }
    public String getISBN () {
        return ISBN;
    }
    public String getBarcode() {
        return barcode;
    }
    public String getStatus() {
        return status;
    }
    public void displayBook() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Date: " + getDate());
        System.out.println("Language: " + getLanguage());
        System.out.println("Type: " + getType());
        System.out.println("Pages: " + getPages());
        System.out.println("Edition: " + getEdition());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Barcode: " + getBarcode());
        System.out.println("Status: " + getStatus());
    }
//Write
    public void setStudentID(String id) {
        this.id = id;
        System.out.println("Student ID: " + id);
    }

//Write for Read and Write
    public void setStatus(String status) {
        this.status = status;
    }

//Read and Write
    public void ReadandSetStatus() {
        String current = getStatus();
        if (current != null && current.equalsIgnoreCase("available")) {
            setStatus("Unavailable");
        }
        System.out.println("Status: " + getStatus());
    }

}
