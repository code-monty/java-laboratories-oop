package Laboratories;
public class encapsulation {
    
    public static void main(String[] args) {
        encap caps = new encap("Alexis", 21, "Tagaytay City");

       

        caps.setName("Sophia");
        caps.setAge(19);
        caps.setPlace("Cavite");
       
         System.out.println(caps.getName());
        System.out.println(caps.getAge());
        System.out.println(caps.getPlace());
    }
}
