package Aula3;
import java.io.IOException;
import java.util.Scanner;

public class bee_1067 {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite um valor de limite: ");
        int valor = sc1.nextInt();

        for (int i = 1; i <= valor; i++) {
            if (i % 2!= 0) {
                System.out.println(i);
            }
        }

    }
}



