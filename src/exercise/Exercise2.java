package exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nap so tien ");
        final int rate = 23000;
        int usd = scanner.nextInt();
        int vnd = rate * usd;
        System.out.printf("So tien duoc doi tu vnd sang usd la: %d",vnd);


    }
}
