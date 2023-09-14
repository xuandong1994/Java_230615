package BaiTapTrenLop;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời nhập chuỗi 1:");
        String str = scanner.nextLine();

        System.out.println("Mời nhập chuỗi 2 :");
        String str2 = scanner.nextLine();

        System.out.println("So sánh " + str.equals(str2));
    }
}
