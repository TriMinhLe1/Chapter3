/**
 * @class: BMI
 * @author: Tri M. Le
 * @course: ITEC 2140 - 05
 * @version: 1.1;
 * @date: February 9th, 2023
 * description: Calculate BMI
 */
import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double weight, height;

        System.out.println("Hello, please start with the weight. Numbers are assumed to be in pounds");
        weight=input.nextDouble();
        System.out.println("Good. Now, please enter the height. Numbers are assumed to be in inches");
        height=input.nextDouble();

        weight*=0.4536;
        height*=0.0254;

        double BMI=(weight)/(height*height);

        if(BMI<18.5) {
            System.out.println("The BMI is Underweight.");
        }
        else if(18.5<= BMI && BMI<25.0) {
            System.out.println("The BMI is Normal.");
        }
        else if(25.0 <= BMI && BMI < 30.0){
            System.out.println("The BMI is Overweight.");
        }
        else if(BMI >=30.0){
            System.out.println("The BMI is Obese.");
        }
    }
}
