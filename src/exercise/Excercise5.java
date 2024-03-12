package exercise;

import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
       System.out.println(String.format(" %50s","DANH SACH SINH VIEN"));
       String lineSeparation = "-----------------------------------------------------------------------------------------------";
//       // stt :5
        // ho va ten: 20
        // tuoi: 10;
        //Sdt" 10
        //email 15;
        String headerFormat = "| %-5s | %-20s | %-10s | %-20s | %-25s |";
        String bodyFormat =  "| %-5d | %-20s | %-10d | %-20s | %-25s |";
        System.out.println(lineSeparation);
        System.out.println(String.format(headerFormat, "STT", "Ho va Ten", "Tuoi", "So dien thoai", "Email"));
        System.out.println(lineSeparation);
        System.out.println(String.format(bodyFormat, 1, "Nguyen Van A", 20, "0904488481", "anv@rikkeiacadeny.com" ));
        System.out.println(lineSeparation);
        System.out.println(String.format(bodyFormat, 2, "Nguyen Van B", 21, "0904488482", "bnv@rikkeiacadeny.com" ));
        System.out.println(lineSeparation);
        System.out.println(String.format(bodyFormat, 3, "Nguyen Van C", 18, "0904488483", "cnv@rikkeiacadeny.com" ));
        System.out.println(lineSeparation);
        System.out.println(String.format(bodyFormat, 4, "Nguyen Van D", 19, "0904488484", "dnv@rikkeiacadeny.com" ));
        System.out.println(lineSeparation);
        System.out.println(String.format(bodyFormat, 5, "Nguyen Van E", 22, "0904488485", "env@rikkeiacadeny.com" ));
        System.out.println(lineSeparation);
        System.out.println(String.format(bodyFormat, 6, "Nguyen Van F", 21, "0904488486", "fnv@rikkeiacadeny.com" ));
        System.out.println(lineSeparation);
        System.out.println(String.format(bodyFormat, 7, "Nguyen Van G", 23, "0904488487", "gnv@rikkeiacadeny.com" ));
        System.out.println(lineSeparation);
        System.out.println(String.format(bodyFormat, 8, "Nguyen Van H", 19, "0904488488", "hnv@rikkeiacadeny.com" ));
        System.out.println(lineSeparation);
        System.out.println(String.format(bodyFormat, 9, "Nguyen Van I", 18, "0904488489", "inv@rikkeiacadeny.com" ));
        System.out.println(lineSeparation);
        System.out.println(String.format(bodyFormat, 10, "Nguyen Van K", 21, "0904488480", "knv@rikkeiacadeny.com" ));
        System.out.println(lineSeparation);


    }
}

