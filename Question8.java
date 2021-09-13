import java.io.*;
import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        Scanner anubhav = new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter two decimal numbers");
        a = anubhav.nextFloat();
        b = anubhav.nextFloat();
        c = a*b;
        System.out.println("Multiplication of 2 decimal number is:");
        System.out.println(c);
    } 
}
