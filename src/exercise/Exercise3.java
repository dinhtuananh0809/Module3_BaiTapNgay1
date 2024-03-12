package exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        int width = scanner.nextInt();
        System.out.println("Nhap chieu rong");
        int height = scanner.nextInt();
        int cv = (width + height)* 2;
        int dt = width * height;
        System.out.println(String.format("Chu vi hinh chu nhat la : %d", cv));
        System.out.println(String.format("Dien tich hinh chu nhat: %d",dt));
    }
}
