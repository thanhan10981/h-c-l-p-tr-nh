package Quanlythuvien;

public class nguoidung {
    String tenDangNhap;
    String matKhau;

    public nguoidung(String tenDangNhap, String matKhau) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    }

    public String toString() {
        return "Ten dang nhap:" + tenDangNhap + "\n" + "Mat Khau:" + matKhau + "\n--------------------";
    }
}
