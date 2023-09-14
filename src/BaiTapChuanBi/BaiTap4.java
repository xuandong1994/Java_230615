package BaiTapChuanBi;

public class BaiTap4 {
    double a;
    double b;

    public BaiTap4() {
    }

    public BaiTap4(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //phương thức tính tổng
    public double add(){
        return a+b;
    }
    //tính hiệu
    public double sub(){
        return a-b;
    }
    //tính tích
    public double multi(){
        return  a*b;
    }
    //tính thương
    public double div(){
        return a/b;
    }
}
