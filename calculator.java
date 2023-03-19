import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 , num2;
        char operator;

        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        num2 = scanner.nextInt();
        System.out.println("enter which operator you want to use: '*','+','/','-'");
        operator = scanner.next().charAt(0); //java doesnot have nextchar() for char type so we use next().charAt()


        int result = 0;
        switch(operator){
            case '+':
            result = add(num1 , num2);
            break;

            case '*':
            result = multiply(num1 ,num2);
            break;

            case '-':
            result = subtract(num1 , num2);
            break;

            case '/':
            result = divide(num1 , num2);
            break;

            default:
            System.out.println("Invalid");
            break;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

    }

    public static int add(int num1 , int num2){
        return num1 + num2;
    }

    public static int subtract(int num1 , int num2){
        return num1 - num2;
    }

    public static int multiply(int num1 , int num2){
        return num1 * num2;
    }
    public static int divide(int num1 , int num2){
        return num1/num2;
    }

}   

        
        
        
