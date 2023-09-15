package BaiTapTrenLopSS4;

import java.util.Arrays;
import java.util.Scanner;

public class BT_TongHop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];


        for (int i = 0; i < N; i++) {
            System.out.println("Nhập các phần tử của mảng:" + (i+1));
            array[i] = scanner.nextInt();
        }

        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Thêm phần tử vào đầu mảng");
            System.out.println("2. Thêm phần tử vào cuối mảng");
            System.out.println("3. Thêm phần tử vào vị trí index");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập phần tử muốn thêm vào đầu mảng: " );
                    int element1 = scanner.nextInt();
                    int[] newArray1 = new int[array.length + 1];
                    newArray1[0] = element1;
                    for (int i = 0; i < array.length; i++) {
                        newArray1[i + 1] = array[i];
                    }
                    array = newArray1;
                    System.out.println("Đã thêm phần tử vào đầu mảng.");
                    System.out.println(Arrays.toString(newArray1));
                    break;
                case 2:
                    System.out.print("Nhập phần tử muốn thêm vào cuối mảng: ");
                    int element2 = scanner.nextInt();
                    int[] newArray2  = new int[array.length + 1];
                    for (int i = 0; i < array.length; i++) {
                        newArray2[i] = array[i];
                    }
                    newArray2[array.length ] = element2;
                    array = newArray2;
                    System.out.println("Đã thêm phần tử vào cuối mảng.");
                    System.out.println(Arrays.toString(newArray2));
                    break;
                case 3:
                    System.out.print("Nhập phần tử muốn thêm: ");
                    int element3 = scanner.nextInt();
                    System.out.print("Nhập vị trí index muốn thêm phần tử: ");
                    int index = scanner.nextInt();
                    int[] newArray3 = new int[array.length + 1];
                    for (int i = 0; i < index; i++) {
                        newArray3[i] = array[i];
                    }
                    newArray3[index] = element3;
                    for (int i = index + 1; i < newArray3.length; i++) {
                        newArray3[i] = array[i - 1];
                    }
                    array = newArray3;
                    System.out.println("Đã thêm phần tử vào vị trí index.");
                    System.out.println(Arrays.toString(newArray3));
                    break;

                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);

    }
}