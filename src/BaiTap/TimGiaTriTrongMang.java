package BaiTap;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] studentsList = {"A","B","C","D","C"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần tìm");
        String searchName = sc.nextLine();
        boolean isExit = false;
        for (int i = 0; i < studentsList.length; i++) {
            if (studentsList[i].equals(searchName)) {
                System.out.println("Vị trí cua sinh viên " + searchName + " trong danh sách tại vị trí " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy sinh viên" + searchName + "trong danh sách");
        }
    }
}
