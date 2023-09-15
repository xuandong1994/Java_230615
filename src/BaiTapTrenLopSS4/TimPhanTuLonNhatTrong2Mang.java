package BaiTapTrenLopSS4;

public class TimPhanTuLonNhatTrong2Mang {
    public static void main(String[] args) {
        // Bước 1: Khai báo một mảng số nguyên bất kỳ
        int[] numbers = {10, 5, 8, 2, 7, 3};

        // Bước 2: Tìm số lớn thứ 2 bằng cách sử dụng một vòng lặp và hai biến trung gian max và max2
        int max = Integer.MIN_VALUE; // Giá trị lớn nhất
        int max2 = Integer.MIN_VALUE; // Giá trị lớn thứ 2

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                // Nếu số hiện tại lớn hơn giá trị lớn nhất,
                // cập nhật max2 thành giá trị hiện tại của max
                // và cập nhật max thành giá trị hiện tại của số
                max2 = max;
                max = numbers[i];
            } else if (numbers[i] > max2 && numbers[i] < max) {
                // Nếu số hiện tại lớn hơn giá trị lớn thứ 2 nhưng nhỏ hơn giá trị lớn nhất,
                // cập nhật max2 thành giá trị hiện tại của số
                max2 = numbers[i];
            }
        }

        // Kiểm tra nếu không tìm thấy số lớn thứ 2
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("Không tìm thấy số lớn thứ 2 trong mảng.");
        } else {
            System.out.println("Số lớn thứ 2 trong mảng là: " + max2);
        }
    }
}
