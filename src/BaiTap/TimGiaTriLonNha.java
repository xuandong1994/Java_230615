package BaiTap;

import java.util.Scanner;

public class TimGiaTriLonNha {
    public static void main(String[] args) {
        double[] danhSach = new double[20];
        int soLuong = 0;

        System.out.println("Nhập giá trị tài sản của các tỷ phú (tối đa 20 giá trị):");
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị tài sản từ người dùng
        while (soLuong < 20) {
            System.out.print("Giá trị tài sản: ");
            double giaTri = scanner.nextDouble();
            danhSach[soLuong] = giaTri;
            soLuong++;
        }

        // Tìm giá trị lớn nhất và vị trí của nó trong danh sách
        double gtln = danhSach[0];
        int viTri = 0;

        for (int i = 1; i < soLuong; i++) {
            if (danhSach[i] > gtln) {
                gtln = danhSach[i];
                viTri = i;
            }
        }

        System.out.println("Giá trị tài sản lớn nhất là: " + gtln);
        System.out.println("Vị trí của giá trị tài sản lớn nhất trong danh sách là: " + (viTri + 1));
    }
}
