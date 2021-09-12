import java.io.*;
import java.util.*;
public class Question3 {
    public static void main(String[] args){
        System.out.println("Enter a nummber");
        Scanner anubhav = new Scanner(System.in);
        int a,b,sum;
        a= anubhav.nextInt();
        System.out.println("Enter another number");
        b=anubhav.nextInt();
        sum=a+b;
        System.out.println("Sum of the number entered by user");
        System.out.println(sum);
    }
}
