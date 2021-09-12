import java.io.*;
import java.util.*;
public class Question4 {
    public static void main(String[] args){
    Scanner anubhav = new Scanner(System.in);
    System.out.println("Enter divisor and dividend");
    int divs,de;
    divs = anubhav.nextInt();
    de = anubhav.nextInt();
    System.out.println("Quotient is");
    System.out.println(de/divs);
    System.out.println("Remainder is");
    System.out.print(de%divs);
}
}
