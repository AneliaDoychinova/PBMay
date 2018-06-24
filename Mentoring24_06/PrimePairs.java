package Mentoring24_06;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= a + c ; i++) {
            for (int j = b; j <= b + d; j++) {
               boolean isFirstPrime = true;

                for (int k = 2; k <= Math.sqrt(i) ; k++) {
                    if (i % k == 0){
                        isFirstPrime = false;
                        break;
                    }
                }

                boolean isSecondPrime = true;

                for (int k = 2; k <= Math.sqrt(j) ; k++) {
                    if (j % k == 0){
                        isSecondPrime = false;
                        break;
                    }
                }

                if (isFirstPrime && isSecondPrime){
                    System.out.println("" + i + j);
                }
            }
        }
    }
}
