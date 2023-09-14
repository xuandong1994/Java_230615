package BaiTapChuanBi;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập Mã danh mục : ");
        int categoryId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Moi nhập Tên danh mục : ");
        String categoryName = scanner.nextLine();
        System.out.println("Mời nhập mã sản phẩm : ");
        int productId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mờinhaapjp tên sản phẩm : ");
        String productName = scanner.nextLine();
        System.out.println("Mời nhập giá sản phẩm : ");
        float productPrice = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Mời nhập danh mục sản phẩm");
        String category = scanner.nextLine();

            Category category1 = new Category();
            category1.setCategoryId(categoryId);
        category1.setCategoryName(categoryName);
        category1.display();

        Product product = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductPrice(productPrice);
        product.setCategory(category);
        product.display();

    }
}
