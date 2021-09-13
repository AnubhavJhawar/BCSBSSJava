import java.io.*;
import java.util.*;
public class Question6{
    public static void main(String[] args){
    int a,b,c;
    System.out.println("Enter a number");
    Scanner anubhav = new Scanner(System.in);
    a = anubhav.nextInt();
    System.out.println("Enter another integer");
    b = anubhav.nextInt();
    c=a;
    a=b;
    b=c;
    System.out.println("Swapped number are:");
    System.out.println(a);
    System.out.println(b);
}
}
