package BaiTapTrenLopSS4;

import java.util.Scanner;

public class Mang2chieu {
    public static void main(String[] args) {
        // Bước 1: Tính tổng các phần tử của một ma trận vuông có sẵn
        int[][] arrInt = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sum += arrInt[i][i] + arrInt[i][arrInt.length - 1 - i];
        }

        System.out.println("Tổng các phần tử có tọa độ ở hàng ngang và cột dọc bằng nhau là: " + sum);

        // Bước 2: Thu thập ma trận thực từ nhập liệu của người dùng
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của ma trận vuông (số hàng và số cột): ");
        int size = scanner.nextInt();

        int[][] realMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập giá trị cho phần tử có tọa độ [" + i + "][" + j + "]: ");
                realMatrix[i][j] = scanner.nextInt();
            }
        }

        // In ra ma trận thực vừa nhập
        System.out.println("Ma trận vừa nhập:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(realMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
