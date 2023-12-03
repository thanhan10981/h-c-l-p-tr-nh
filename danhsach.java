package Quanlythuvien;

import java.util.*;

public class danhsach {

    public static ArrayList<taiLieu> dachSachThuVien = new ArrayList<>();
    private static ArrayList<nguoidung> danhSachNguoiDung = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void nhapThemSachCoSan(taiLieu tl1) {
        dachSachThuVien.add(tl1);
    }

    public static void timLoai() {
        String l;
        System.out.print("Nhap loai can tim:");
        l = scanner.nextLine();
        for (taiLieu tl : dachSachThuVien) {
            if (tl.loai.equals(l))
                System.out.println(tl);
        }
        scanner.nextLine();
    }

    public static void timTen() {
        String l;
        System.out.print("Nhap ten can tim:");
        l = scanner.nextLine();
        for (taiLieu tl : dachSachThuVien) {
            if (tl.tenSach.equals(l))
                System.out.println(tl);
        }
        scanner.nextLine();
    }

    public static void timTacGia() {
        String l;
        System.out.print("Nhap tac gia can tim:");
        l = scanner.nextLine();
        for (taiLieu tl : dachSachThuVien) {
            if (tl.tacGia.equals(l))
                System.out.println(tl);
        }
        scanner.nextLine();

    }

    public static void nhapThemSach() {
        System.out.print("Nhap so luong sach vao thu vien:");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap loai:");
            String loai = scanner.nextLine();
            System.out.print("Nhap ten:");
            String tenSach = scanner.nextLine();
            System.out.print("Nhap tac gia:");
            String tacGia = scanner.nextLine();
            scanner.nextLine();

            taiLieu tl = new taiLieu(loai, tenSach, tacGia, 0, 0);
            dachSachThuVien.add(tl);
        }

        System.out.println("Nhap sach thanh cong!");
        scanner.nextLine();
    }

    public static void taiLieuYeuThich() {
        for (taiLieu tl : dachSachThuVien) {
            if (tl.diemTrungBinh > 5)
                System.out.println(tl);
        }
        scanner.nextLine();
    }

    public static void danhGia2() {
        System.out.print("Nhap ten can tim:");
        String l = scanner.nextLine();
        for (taiLieu tl : dachSachThuVien) {
            if (tl.tenSach.equals(l)) {
                System.out.println(tl);
                System.out.print("Nhap danh gia diem(1->5diem):");
                double diem = scanner.nextDouble();
                tl.danhGia(diem);
                System.out.println("Da danh gia\n" + tl);

            }
        }
        scanner.nextLine();

    }

    public static void themtkcosan(nguoidung ng_dung) {
        danhSachNguoiDung.add(ng_dung);
    }

    public static void tao_tk_ng_dung() {
        System.out.print("Nhap ho va ten nguoi dung:");
        String tendn = scanner.nextLine();
        System.out.print("Nhap mat khau moi:");
        String matkhau = scanner.nextLine();
        scanner.nextLine();
        nguoidung TK = new nguoidung(tendn, matkhau);
        danhSachNguoiDung.add(TK);
        scanner.nextLine();
    }

    public static void check_tk_ng_dung(String tentk, String mk) {
        
        for (nguoidung TK : danhSachNguoiDung) {
            if (TK.tenDangNhap.equals(tentk) && TK.matKhau.equals(mk)) {
                System.out.println("Dang nhap thanh cong");
                continue;
            } else {
                System.out.println("Dang nhap that bai!");
                return;
            }

        }
    }

    public static void hien_tk_ng_dung() {
        for (nguoidung TK : danhSachNguoiDung) {
            System.out.println(TK);
        }
        scanner.nextLine();
    }

    public static void check_muon_tra() {
        System.out.print("Nhap ten can tim:");
        String l = scanner.nextLine();
        for (taiLieu tl : dachSachThuVien) {
            if (tl.tacGia.equals(l)) {
                if (tl.muon_tra == false) {
                    System.out.println("Chua muon");
                } else if (tl.muon_tra == true) {
                    System.out.println("Da muon");
                }

            }
        }
        scanner.nextLine();
    }

    public static void chinh_sua_muon_tra() {
        System.out.print("Nhap ten can tim:");
        String l = scanner.nextLine();
        for (taiLieu tl : dachSachThuVien) {
            if (tl.tacGia.equals(l)) {
                System.out.println(tl);
                System.out.print("Nhap chinh sua muon tra:");
                boolean n = scanner.nextBoolean();
                tl.muon_tra(n);
            }
        }
        scanner.nextLine();
    }

}
