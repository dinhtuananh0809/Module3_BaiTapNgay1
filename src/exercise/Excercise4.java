package exercise;

import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nap vao 1 so");
        int number = scanner.nextInt();
        int square = number * number;
        int cube = number * number * number;
        System.out.printf("Bình phương của %d là: %d \n" ,number, square );
        System.out.printf("Lập phương của %d là %d", number, cube);
    }
}
