import java.io.*;
import  java.util.*;
public class Question11 {
  public static void main(String[] args) {
      int a,b,c,d;
      Scanner anubhav = new Scanner(System.in);
      d = Integer.MIN_VALUE;
      System.out.println("Enter 3 number to find largest among them");
       a = anubhav.nextInt();
       b = anubhav.nextInt();
       c = anubhav.nextInt(); 
       if(a>d){
         d=a;
       }
       if(b>d){
           d=b;
       }
       if(c>d){
           d=c;
       }
       System.out.println("The greatest number is "+d+" among the 3 numbers");
    }
}