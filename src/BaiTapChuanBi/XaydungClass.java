package BaiTapChuanBi;

import java.util.Scanner;

public class XaydungClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập mã học sinh : ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Mời nhập Tên học sinh : ");
        String studentName = sc.nextLine();
        System.out.println(" Mời nhập Giới tính");
        boolean sex = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Mời nhập tên lớp : ");
        String className = sc.nextLine();
        System.out.println("Mời nhập tuổi : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Mời nhập địa chỉ : ");
        String address = sc.nextLine();

        BaiTap2 baiTap2 = new BaiTap2();
        baiTap2.setStudentId(studentId);
        baiTap2.setStudentName(studentName);
        baiTap2.setSex(sex);
        baiTap2.setClassName(className);
        baiTap2.setAge(age);
        baiTap2.setAddress(address);
        baiTap2.display();

    }
}
