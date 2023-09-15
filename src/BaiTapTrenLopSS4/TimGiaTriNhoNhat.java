package BaiTapTrenLopSS4;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            arr[i] = scanner.nextInt();
        }
        // Bước 3: Gán phần tử đầu tiên trong mảng là giá trị nhỏ nhất
        int minvalue = arr[0];
        // Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mảng
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minvalue){
                minvalue = arr[i];
            }
            
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minvalue);
    }
}
