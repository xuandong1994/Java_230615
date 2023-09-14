package BaiTapChuanBi;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chiều dài : ");
        double width = scanner.nextDouble();
        System.out.println("Mời nhập chiều rộng :");
        double height = scanner.nextDouble();

        BaiTap1 baiTap1 = new BaiTap1();
        baiTap1.setWidth(width);
        baiTap1.setHeight(height);
        System.out.println("diện tích hình chữ nhật là : "+baiTap1.getArea());
        System.out.println("Chu vi hình chữ nhật là : "+baiTap1.getPerimeter());
        System.out.println("Display hình chữ nhật là : "+baiTap1.display());


    }
}
