package Mentoring27_05;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double avgGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0.0;
        double excellentScholarship = 0.0;

        if (income < minSalary){
            if (avgGrade >= 5.50){
                excellentScholarship = avgGrade * 25;
                socialScholarship = minSalary * 0.35;
            }else if(avgGrade >= 4.50) {
                socialScholarship = minSalary * 0.35;
            }
        }else {
            if (avgGrade >= 5.50){
                excellentScholarship = avgGrade * 25;
            }
        }

        if (socialScholarship == 0 && excellentScholarship == 0){
            System.out.println("You cannot get a scholarship!");
        }else if (socialScholarship > excellentScholarship){
            System.out.printf("You get a Social scholarship %.0f BGN",
                    Math.floor(socialScholarship));
        }else {
            System.out.printf("You get a scholarship for excellent results %.0f BGN",
                    Math.floor(excellentScholarship));
        }
    }
}
