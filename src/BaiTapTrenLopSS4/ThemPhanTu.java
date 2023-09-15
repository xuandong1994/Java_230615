package BaiTapTrenLopSS4;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        Scanner scanner = new Scanner(System.in);
        int index;

        do {
            System.out.println("Nhập vị trí cần chèn:");
            index = scanner.nextInt();
            if (index < 0 || index >= arr.length) {
                System.out.println("Không chèn được.");
            }
        } while (index < 0 || index >= arr.length);

        System.out.println("Nhập số cần chèn:");
        int x = scanner.nextInt();

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = x;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        System.out.println("Mảng sau khi chèn: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

        }

    }

