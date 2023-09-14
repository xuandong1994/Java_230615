package BaiTap;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    fahrenheitToCelsius();
                    break;
                case 2:
                    celsiusToFahrenheit();
                    break;
                case 0:
                    System.out.println("Ứng dụng kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        } while (choice != 0);
    }

    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập nhiệt độ Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Nhiệt độ Celsius: " + celsius);
    }

    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập nhiệt độ Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println("Nhiệt độ Fahrenheit: " + fahrenheit);
    }
}
