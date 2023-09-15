package BaiTapTrenLopSS4;

import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập dòng");
        int row = sc.nextInt();
        System.out.println("Mời bạn nhập cột");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập giá trị tại hàng " + (i+1)+ ",cột" + (j+1));
                arr[i][j] = sc.nextInt();
            }

        }
        int maxvalue = arr[0][0];
        for(int i=0; i<row; i++){
            for (int j = 0; j <col ; j++) {
                if (arr[i][j] > maxvalue);
            }
            System.out.println();
        }
    }
}
