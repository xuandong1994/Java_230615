package BaiTap;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 8, 10, 6, 9};
        int minValue = minValue(arr);
        System.out.println("Gia trị nhỏ nhat của mảng là : " + arr[minValue]);
    }
    public static int minValue(int[] array) {
        int minValue = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minValue]) {
                minValue = i;
            }
        }
        return minValue;
    }
}
