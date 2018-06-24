package Mentoring24_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            try{
                int n = Integer.parseInt(scanner.nextLine());

                if (n % 2 == 0){
                    System.out.println("Even number entered: " + n);
                    break;
                }

                System.out.println("The number is not even.");
            } catch (Exception ex){
                System.out.println("Invalid number!");
            }

        }
    }
}
