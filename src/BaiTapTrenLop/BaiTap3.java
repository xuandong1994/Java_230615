package BaiTapTrenLop;

import java.util.Scanner;
import java.util.SortedMap;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập 1 chuỗi : ");
        String str2 = scanner.nextLine();
        StringBuffer str = new StringBuffer(str2);
        System.out.println("Chuỗi đảo ngược là " + str.reverse());
    }
}
