package Aula3;

import java.util.Scanner;

public class bee_1070 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int X = sc1.nextInt();

        if (X % 2 == 0) {
            X++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(X);
            X += 2;
        }

        sc1.close();

    }
}
