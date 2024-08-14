import java.util.*;
public class DoWhile1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        do{
            System.out.println("Enter a number: ");
            value = sc.nextInt();
            System.out.println("You entered: " + value);
        }while(value != 5);
        sc.close();
    }
}
