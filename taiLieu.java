package Quanlythuvien;

public class taiLieu {
    String loai;
    String tenSach;
    String tacGia;
    double diemTrungBinh;
    boolean muon_tra;

    public taiLieu(String loai, String tenSach, String tacGia, double diemTrungBinh, int j) {
        this.loai = loai;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.diemTrungBinh = diemTrungBinh;
        this.muon_tra = false;

    }
   
    public void danhGia(double diem) {
        // Cập nhật điểm trung bình khi có đánh giá mới
        this.diemTrungBinh = (this.diemTrungBinh + diem);
    }

    public void muon_tra(boolean i) {
        this.muon_tra = i;
    }

    public String toString() {
        return "Loai: " + loai + ", Tieu de: " + tenSach + ", Tac gia: " + tacGia + ", Diem danh gia TB: "
                + diemTrungBinh;
    }

}
