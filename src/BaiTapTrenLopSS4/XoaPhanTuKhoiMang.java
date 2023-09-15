package BaiTapTrenLopSS4;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 3, 2, 4, 6, 8};
        Scanner scanner = new Scanner(System.in);

        // Bước 2: Nhập phần tử cần xoá
        System.out.print("Nhập giá trị cần xoá: ");
        int x = scanner.nextInt();

        // Bước 3: Tìm và xoá phần tử X khỏi mảng
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                // Xoá phần tử X bằng cách dịch các phần tử phía sau lên trước
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                found = true;
                break;
            }
        }

        // Bước 5: In ra mảng sau khi xoá
        if (found) {
            // Giảm kích thước mảng đi 1
            array = Arrays.copyOf(array, array.length - 1);
            System.out.println("Mảng sau khi xoá: " + Arrays.toString(array));
        } else {
            System.out.println("Phần tử không tồn tại trong mảng.");
        }

    }

}
