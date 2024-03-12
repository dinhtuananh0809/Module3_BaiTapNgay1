package exercise;

import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem mon Toan");
        float mathScore = scanner.nextFloat();
        System.out.println("Nhap diem mon Van");
        float literatureScore = scanner.nextFloat();
        System.out.println("Nhap diem mon Anh");
        float engScore = scanner.nextFloat();
        float sum = mathScore + literatureScore + engScore;
        float average = (mathScore + literatureScore + engScore)/3;
        System.out.printf("Tổng điểm của 3 môn %.1f %.1f %.1f là %.2f \n",mathScore, literatureScore,engScore, sum);
        System.out.printf("Trung bình của 3 môn %.1f %.1f %.1f là %.2f", mathScore, literatureScore, engScore,average);
    }
}
