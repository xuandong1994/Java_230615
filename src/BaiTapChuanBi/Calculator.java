package BaiTapChuanBi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Mời nhập a : ");
        double a = scanner.nextDouble();
        System.out.println("Mời nhập b :");
        double b =scanner.nextDouble();

        BaiTap4 calculator = new BaiTap4(a,b);
        System.out.println("Tổng: " + calculator.add());
        System.out.println("Hiệu: " + calculator.sub());
        System.out.println("Tích: " + calculator.multi());
        System.out.println("Thương: " + calculator.div());


    }
}
