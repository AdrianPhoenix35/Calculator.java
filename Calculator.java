/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adrian.calculator;

/**
 *
 * @author ADRIAN M
 */
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result = 0;
        System.out.println("Enter first number:");
        num1= scanner.nextDouble();
        System.out.print("Enter operator(+,-,*,/):");
        operator =scanner.next().charAt(0);
        System.out.print("Enter second number:");
        num2 =scanner.nextDouble();
        switch(operator){
            case'+'-> result= num1+num2;
            case'-'-> result =num1+num2;
            case'*'-> result = num1*num2;
            case'/'->{
                if(num2==0){
                    System.out.println("Can not divide by 0");
             
                }
                else{
                    result = num1/num2;
                }
                    
                }
        }
        System.out.println(result);
    }
}
