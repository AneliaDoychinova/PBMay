package Mentoring11_06;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200){
                p1++;
            } else if (num < 400){
                p2++;
            } else if (num < 600){
                p3++;
            } else if (num < 800){
                p4++;
            } else {
                p5++;
            }
        }

        double p1Percents = p1 / n * 100;
        double p2Percents = p2 / n * 100;
        double p3Percents = p3 / n * 100;
        double p4Percents = p4 / n * 100;
        double p5Percents = p5 / n * 100;

        System.out.printf("%.2f%%%n", p1Percents);
        System.out.printf("%.2f%%%n", p2Percents);
        System.out.printf("%.2f%%%n", p3Percents);
        System.out.printf("%.2f%%%n", p4Percents);
        System.out.printf("%.2f%%%n", p5Percents);
    }
}
