import java.io.*;
import java.util.*;

public class Question9{
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number to check wheather a number is even or odd");
        Scanner anubhav = new Scanner(System.in);
        a = anubhav.nextInt();
        if(a%2==0){
            System.out.println("The number "+a+" is even");
        }
        else{
            System.out.println("The number"+a+" is odd");
        }
    }
}
