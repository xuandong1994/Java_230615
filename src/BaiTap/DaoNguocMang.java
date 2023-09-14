package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phan tử của mảng : ");
        int n =scanner.nextInt();
        if (n >20 ){
            System.out.println("Sô lượng phần tử vượt quá giới hạn ");
            return;
        }
        //khởi tạo mảng
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu" + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Mảng sau khi đảo ngược " + Arrays.toString(arr));

    }
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Hoán đổi giá trị của hai phần tử
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
