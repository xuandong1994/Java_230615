package BaiTapTrenLopSS4;

import java.util.Scanner;

public class TinhTongCacCot {
    public static void main(String[] args) {
        // Bước 1: Tính tổng các phần tử của một mảng có sẵn
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cột bạn muốn tính tổng: ");
        int col = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][col];
        }

        System.out.println("Tổng của cột thứ " + col + " là: " + sum);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        double[][] realArray = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                realArray[i][j] = scanner.nextDouble();
            }
        }

        // In ra mảng thực vừa nhập
        System.out.println("Mảng thực vừa nhập:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(realArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
