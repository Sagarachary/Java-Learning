import java.util.*;
public class gettinguserinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Hello " + name);
    }
}
