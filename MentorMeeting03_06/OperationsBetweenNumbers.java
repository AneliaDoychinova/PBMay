package MentorMeeting03_06;

import java.util.Scanner;
            /*if (num1 % 2 == 0){
              evenOrOdd = "even";
          }else{
              evenOrOdd = "odd";
          } */
//Equals to =>
//evenOrOdd = num1 % 2 == 0 ? "even" : "odd";
public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();

        String evenOrOdd = "";

        if (num2 == 0 && (operator.equals("/") || operator.equals("%"))){
            System.out.printf("Cannot divide %.0f by zero", num1);
        } else {
            if (operator.equals("+")){
                double result = num1 + num2;
                evenOrOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%.0f + %.0f = %.0f - %s", num1,num2, result, evenOrOdd);
            } else if (operator.equals("-")){
                double result = num1 - num2;
                evenOrOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%.0f - %.0f = %.0f - %s", num1,num2, result, evenOrOdd);
            } else if (operator.equals("*")){
                double result = num1 * num2;
                evenOrOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%.0f * %.0f = %.0f - %s", num1,num2, result, evenOrOdd);
            } else if (operator.equals("/")){
                double result = num1 / num2;
                System.out.printf("%.0f / %.0f = %.2f", num1, num2 , result);
            } else if (operator.equals("%")){
                double result = num1 % num2;
                System.out.printf("%.0f %% %.0f = %.0f", num1, num2, result);
            }
        }
    }
}
