package Mentoring27_05;

import java.util.Scanner;

public class Number0to100toText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String result = "";

        if (num < 20){
            switch (num){
                case 0:
                    result = "zero";
                    break;
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                case 6:
                    result = "six";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 8:
                    result = "eight";
                    break;
                case 9:
                    result = "nine";
                    break;
                case 10:
                    result = "ten";
                    break;
                case 11:
                    result = "eleven";
                    break;
                case 12:
                    result = "twelve";
                    break;
                case 13:
                    result = "thirteen";
                    break;
                case 14:
                    result = "fourteen";
                    break;
                case 15:
                    result = "fifteen";
                    break;
                case 16:
                    result = "sixteen";
                    break;
                case 17:
                    result = "seventeen";
                    break;
                case 18:
                    result = "eighteen";
                    break;
                case 19:
                    result = "nineteen";
                    break;
                default:
                    result = "invalid number";
            }
        }else if (num <= 100){
            int tens = num / 10;

            switch (tens) {
                case 2:
                    result = "twenty";
                    break;
                case 3:
                    result = "thirty";
                    break;
                case 4:
                    result = "forty";
                    break;
                case 5:
                    result = "fifty";
                    break;
                case 6:
                    result = "sixty";
                    break;
                case 7:
                    result = "seventy";
                    break;
                case 8:
                    result = "eighty";
                    break;
                case 9:
                    result = "ninety";
                    break;
                case 10:
                    result = "one hundred";
            }
            int ones = num % 10;
            switch (ones) {
                case 1:
                    result = result + " one";
                    break;
                case 2:
                    result = result + " two";
                    break;
                case 3:
                    result = result + " three";
                    break;
                case 4:
                    result = result + " four";
                    break;
                case 5:
                    result = result + " five";
                    break;
                case 6:
                    result = result + " six";
                    break;
                case 7:
                    result = result + " seven";
                    break;
                case 8:
                    result = result + " eight";
                    break;
                case 9:
                    result = result + " nine";
                    break;
            }
        }else {
            result = "invalid number";
        }

        System.out.println(result);
    }
}
