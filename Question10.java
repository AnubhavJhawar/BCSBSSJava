import java.io.*;
import java.util.*;
public class Question10 {
    public static void main(String[] args){
     Scanner anubhav = new Scanner(System.in);
     System.out.println("Enter a particular character to chcek weather it is consonant or vowel");
     char al;
     al = anubhav.nextLine().charAt(0);
     if(al=='a'||al=='e'||al=='i'||al=='o'||al=='u'){
         System.out.println("the Character " + al +" is vowel" );
     }
     if(al=='A'||al=='E'||al=='I'||al=='O'||al=='U'){
         System.out.println("The Character " + al +" is vowel");
     }
     else{
         System.out.println("The character "+al + " is consonant");
     }
}
}