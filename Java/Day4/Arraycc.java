package Day4;
import java.util.*;
public class Arraycc {
    public static void main(String[] args){
        // Declara the array in intial order
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Array :" +marks[0]);
        System.out.println("basic algorithm :" +marks[1]);
        System.out.println("Dsa :" +marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage :" +percentage+ "%");
        // scanner close
        sc.close();
    }
}
