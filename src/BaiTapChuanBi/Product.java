package BaiTapChuanBi;

public class Product {
    int productId;
    String productName;
    float  productPrice;
    String category;

    public Product() {
    }

    public Product(int productId, String productName, float productPrice, String category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void display() {
        System.out.println("Mã sản phẩm : " + productId + "\n"
        + "Tên sản phẩm " + "\n" + " Giá " + "\n" + "danh mục " + category);
    }
}
