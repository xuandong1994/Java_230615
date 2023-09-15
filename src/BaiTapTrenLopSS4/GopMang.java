package BaiTapTrenLopSS4;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number1 = {1,2,3,4,5};
        int[] number2 = {6,7,8,9,10};
        int[] newArr = new int[(number1.length + number2.length)];
        for (int i = 0; i < number1.length; i++) {
            newArr[i] = number1[i];
        }
        for (int i = 0; i <number2.length ; i++) {

            newArr[i+number1.length]=number2[i];

        }

        for (int item: newArr
             ) {
            System.out.print("\t"+item);
        }
    }
}
