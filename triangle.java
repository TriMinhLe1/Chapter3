/**
 * @class: triangle
 * @author: Tri M. Le
 * @course: ITEC 2140 - 05
 * @version: 1.1;
 * @date: February 9th, 2023
 * description: perimeter of triangle.
 */
import java.util.Scanner;
public class triangle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double a,b,c;


        System.out.println("Hello, please type the size of the edges of the triangle. One at a time.");
        a=input.nextDouble();
        System.out.println("Good. Please enter the next number.");
        b=input.nextDouble();
        System.out.println("Good. Now please enter the last value.");
        c=input.nextDouble();
        boolean valid= ((a+b>c)&&(a+b>c)&&(c+b>a));

        double prem=a+b+c;

        System.out.println("The perimeter is "+prem+". Also, the input is " +valid);


    }
}
