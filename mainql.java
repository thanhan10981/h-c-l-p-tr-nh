package Quanlythuvien;

public class mainql {
        public static void main(String[] args) {

                danhsach ds = new danhsach();
                ds.nhapThemSachCoSan(new taiLieu("Sach", "Toan", "Mai Trong ki", 10, 1));
                ds.nhapThemSachCoSan(new taiLieu("Sach", "Ngu Van 1", "Bo giao duc va dao tao", 0, 0));
                ds.nhapThemSachCoSan(new taiLieu("Sach", "Ngu Van 2", "Bo giao duc va dao tao", 7, 1));
                ds.nhapThemSachCoSan(new taiLieu("Sach", "Tieng Anh", "Bo giao duc va dao tao", 3, 0));
                ds.nhapThemSachCoSan(new taiLieu("Sach", "Lich Su", "Pham Thi Hong Que", 8, 0));
                ds.nhapThemSachCoSan(new taiLieu("Sach", "Dia Ly", "Bo giao duc va dao tao", 6, 1));
                ds.nhapThemSachCoSan(new taiLieu("Sach", "Hoa Hoc", "Bo giao duc va dao tao", 0, 0));
                ds.nhapThemSachCoSan(new taiLieu("Sach", "Vat ly", "Bo giao duc va dao tao", 0, 0));
                ds.nhapThemSachCoSan(new taiLieu("Sach", "Sinh Hoc", "Bo giao duc va dao tao", 0, 1));
                ds.nhapThemSachCoSan(new taiLieu("Sach", "Cong Nghe", "Bo giao duc va dao tao", 0, 0));

                ds.nhapThemSachCoSan(
                                new taiLieu("Bao", "Ban ve gia phap kinh te so trong boi canh hien nay ",
                                                "Phan trong phuc", 0, 1));
                ds.nhapThemSachCoSan(
                                new taiLieu("Bao",
                                                "Tang cuong quan ly Nha nuoc doi voi von dau tu truc tiep nuoc ngoai o Viet Nam ",
                                                "Tran Minh Hoang & Le The Anh ", 0, 0));
                ds.nhapThemSachCoSan(new taiLieu("Bao", "Xuat khau nong san Viet Nam trong boi canh hoi nhap",
                                " Tran Minh Hoang & Vu Truong Son ", 0, 0));
                ds.nhapThemSachCoSan(
                                new taiLieu("Bao", "Quan tri Quoc gia trong boi canh chuyen doi so",
                                                "Vu Truong Son & Vu Van Ha", 0, 1));
                ds.nhapThemSachCoSan(
                                new taiLieu("Bao", "Phat trien thi truong chung khoan trong boi canh moi ",
                                                "Tran Duc Vui", 0, 0));
                ds.nhapThemSachCoSan(
                                new taiLieu("Bao",
                                                "Danh gia hieu qua su dung cong nghe so cai phan tan trong dieu kien nen kinh te so",
                                                "Nguyen Dinh Trung", 0, 1));
                ds.nhapThemSachCoSan(new taiLieu("Bao",
                                "Phe phan quan diem sai trai, xuyen tac ve cong nghiep hoa, hien dai hoa dat nuoc",
                                "Vu Van Ha", 0, 0));

                ds.nhapThemSachCoSan(new taiLieu("Media", "Youtobe", "Chad Hurley, Steve Chen va Jawed Karim", 0, 0));
                ds.nhapThemSachCoSan(new taiLieu("Media", "FaceBook", "Zuckerberg", 0, 0));
                ds.nhapThemSachCoSan(new taiLieu("Media", "Google", "Larry Page va Sergey Brin", 0, 0));
                ds.nhapThemSachCoSan(new taiLieu("Media", "Tiktok", "Truong Nhat Minh", 0, 0));
                ds.nhapThemSachCoSan(new taiLieu("Media", "Radio", "Nikola Tesla, Guglielmo Marconi va Alexander Popov",
                                0, 0));

                danhsach.themtkcosan(new nguoidung("an", "123"));

                new menu();
                menu.menuChinh();

        }
}
