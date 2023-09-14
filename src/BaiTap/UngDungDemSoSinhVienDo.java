package BaiTap;

import java.util.Scanner;

public class UngDungDemSoSinhVienDo {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số lượng sinh viên: ");
            int numberStudents = scanner.nextInt();

            if (numberStudents <= 0 || numberStudents > 30) {
                System.out.println("Số lượng sinh viên không hợp lệ.");
                return;
            }

            int[] diem = new int[numberStudents];
            int count = 0;

            System.out.println("Nhập điểm của từng sinh viên:");
            for (int i = 0; i < numberStudents; i++) {
                System.out.print("Sinh viên " + (i + 1) + ": ");
                diem[i] = scanner.nextInt();

                if (diem[i] >= 5) {
                    count++;
                }
            }

            System.out.println("Số lượng sinh viên đã thi đỗ: " + count);
    }
}
