import java.io.*;
import java.util.*;

import java.lang.Math;
public class Question12 {
    public static void main(String[] args) {
        Double a,b,c,D;
        System.out.println("Enter a,b,c of a quadratic equation");
        Scanner anubhav = new Scanner(System.in);
        Double x1,x2;
        a = anubhav.nextDouble();
        b = anubhav.nextDouble();
        c = anubhav.nextDouble();
        D = b*b-4*(a*c);
        if(D>0){
           x1=(-b+D)/(2*a);
           x2=(-b-D)/(2*a);
           System.out.println("The roots  of following quadratic equation are:");
           System.out.println(x1);
           System.out.println(x2);
        }
        else if(D==0){
            x1= -b/(2*a);
            x2= -b/(2*a);
            System.out.println("The roots  of following quadratic equation are:");
            System.out.println(x1);
            System.out.println(x2);
         
        }
        else {
            Double imag,real;
            imag = Math.sqrt(-D)/(2*a);
            real  = -b/(2*a);
            System.out.println("x1 ="+real+"+ i"+imag);
            System.out.println("x1 ="+real+"- i"+imag);
            
        }
    }
    
}
