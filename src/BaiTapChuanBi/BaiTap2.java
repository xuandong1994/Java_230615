package BaiTapChuanBi;

import org.w3c.dom.ls.LSOutput;

public class BaiTap2 {
    int studentId;
    String studentName;
    boolean sex;
    String className;
    int age ;
    String address;

    public BaiTap2() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(){
        System.out.println("mã học sinh là :" +studentId + "\n Tên :" + studentName + " \n giới tính :" + sex + " \n Lớp : " + className + "\n Tuổi : " + age +"\n đại chỉ :  " + address  );
    }
    public BaiTap2(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;

    }

}
