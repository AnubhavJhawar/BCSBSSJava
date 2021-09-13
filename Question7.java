import java.io.*;
import java.util.*;

public class Question7{
    public static void main(String[] args){
      System.out.println("Enter a character whose ASCII key you need to find");
      Scanner anubhav = new Scanner(System.in);
         char a;
         a = anubhav.nextLine().charAt(0);
         int b = a;
         System.out.println("The ASCII VALUE OF "+a+" is");
         System.out.println(b);
    }
}
