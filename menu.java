package Quanlythuvien;

import java.util.Scanner;

public class menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu2() {
        System.out.println("--------------------MENU---------------------");
        System.out.println("1.Quan ly thu vien(danh cho quan ly)");
        System.out.println("2.Dang nhap thu vien(danh cho nguoi dung) ");
        System.out.println("3.Tim kiem tai lieu");
        System.out.println("4. De Thoat.");
        System.out.println("---------------------------------------------");
        System.out.print("Nhap lua chon cua ban: ");
    }

    public static void menuChinh() {

        while (true) {
            menu2();
            if (scanner.hasNextInt()) {
                int luaChon = scanner.nextInt();
                scanner.nextLine();
                switch (luaChon) {
                    case 1:
                        menuQuanLy();

                        break;
                    case 2:
                        menuDangNhap();

                        break;
                    case 3:
                        timKiemsach();

                        break;
                    case 4:
                        System.out.println("Ban da thoat chuong trinh");
                        System.exit(0);
                    default:
                        System.out.println("Lua chon khong hop le. Vui long chon lai trong menu!");
                        break;
                }
            } else {
                scanner.nextLine();
            }

        }

    }

    public static void nhapmk() {
        System.out.print("Nhap ten Dang nhap:");
        String ten = scanner.nextLine();
        System.out.print("nhap mat khau:");
        String mk = scanner.nextLine();
        danhsach.check_tk_ng_dung(ten, mk);
        menuNguoiDung();
    }

    public static void menuDangNhap() {
        menu3();
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            switch (n) {
                case 1:
                    nhapmk();

                    break;
                case 2:
                    danhsach.tao_tk_ng_dung();

                    break;
                case 3:
                    return;
                default:
                    System.out.println("lua chon khong hop le!");
                    break;
            }
        } else {
            scanner.nextLine();
        }

    }

    public static void menu3() {
        System.out.println("1.Dang nhap");
        System.out.println("2.Tao tai khoan moi");
        System.out.println("3.thoat");
        System.out.print("Nhap lua chon cua ban: ");
    }

    public static void menungdung2() {
        System.out.println("------------------MENU-----------------");
        System.out.println("1.Xem danh sach tai lieu yeu thich");
        System.out.println("2.Danh gia tai lieu ");
        System.out.println("3.De Thoat.");
        System.out.println("---------------------------------------");
        System.out.print("Nhap lua chon cua ban: ");
    }

    public static void menuNguoiDung() {

        while (true) {
            menungdung2();
            if (scanner.hasNextInt()) {
                int luaChon = scanner.nextInt();
                scanner.nextLine();
                switch (luaChon) {
                    case 1:
                        danhsach.taiLieuYeuThich();

                        break;
                    case 2:
                        danhsach.danhGia2();

                        break;
                    case 3:
                        System.out.println("Ban da thoat chuong trinh");
                        return;
                    default:
                        System.out.println("Lua chon khong hop le. Vui long chon lai trong menu!");
                        break;
                }
            } else {
                System.out.print("Vui long nhap 1 so nguyen");
                scanner.nextLine();
            }

        }

    }

    public static void menuql2() {
        System.out.println("----------------MENU----------------");
        System.out.println("1.Quan ly muon va tra tai lieu");
        System.out.println("2.Quan ly danh sach nguoi dung");
        System.out.println("3.Them tai lieu");
        System.out.println("4.De Thoat.");
        System.out.println("------------------------------------");
        System.out.print("Nhap lua chon cua ban: ");
    }

    public static void menuQuanLy() {

        while (true) {
            menuql2();
            if (scanner.hasNextInt()) {
                int luaChon = scanner.nextInt();
                scanner.nextLine();
                switch (luaChon) {
                    case 1:
                        menu_muon_tra();
                        break;
                    case 2:
                        danhsach.hien_tk_ng_dung();

                        break;
                    case 3:
                        danhsach.nhapThemSach();
                        break;
                    case 4:
                        System.out.println("Ban da thoat chuong trinh");
                        return;
                    default:
                        System.out.println("Lua chon khong hop le. Vui long chon lai trong menu!");
                        break;
                }
            } else {
                scanner.nextLine();
            }

        }

    }

    public static void men4() {
        System.out.println("------------MENU------------");
        System.out.println("1.Xem tai lieu muon tra(true=da muon,false=chua muon)");
        System.out.println("2.Chinh sua muon tra");
        System.out.println("3.Hien thi tat ca danh sach");
        System.out.println("4.Thoat");
        System.out.print("Nhap lua chon cua ban:");
    }

    public static void menu_muon_tra() {
        while (true) {
            men4();
            int chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon) {
                case 1:
                    danhsach.check_muon_tra();
                    break;
                case 2:
                    danhsach.chinh_sua_muon_tra();
                    break;
                case 3:
                    timKiemsach();
                case 4:
                    return;
                default:
                    System.err.println("Lua chon khong hop le!");
                    break;
            }
        }
    }

    public static void menuTimSach() {
        System.out.println("----------------MENU---------------");
        System.out.println("1.Tim kiem bang ten loai ");
        System.out.println("2.Tim kiem bang ten ");
        System.out.println("3.Tim kiem bang ten tac gia");
        System.out.println("4.Thoat");
        System.out.println("-----------------------------------");
        System.out.print("Nhap lua chon:");
    }

    public static void timKiemsach() {
        menuTimSach();
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    danhsach.timLoai();
                    break;
                case 2:
                    danhsach.timTen();

                    break;
                case 3:
                    danhsach.timTacGia();

                    break;
                case 4:
                    return;
                default:
                    System.err.println("Lua chon khong hop le!");
                    break;

            }
        } else {
            scanner.nextLine();
        }

    }

}
