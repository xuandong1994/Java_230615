package BaiTapChuanBi;

public class Category {
     int categoryId;
    String categoryName;

    public Category() {
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void display(){
        System.out.println("Mã danh mục : " + categoryId + "\n" +
                "Tên danh mục : " + categoryName);
    }
}
