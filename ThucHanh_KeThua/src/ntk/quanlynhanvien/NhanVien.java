package ntk.quanlynhanvien;

public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;

    public NhanVien() {
        super();
    }

    public NhanVien(String maNhanVien, String tenNhanVien, double LuongCoBan) {
        maNV = maNhanVien;
        hoTen = tenNhanVien;
        luongCoBan = LuongCoBan;
    }

    public double tinhLuong() {
        return luongCoBan;
    }

//    @Override
//    public String toString() {
//        return "Nhan Vien [ MaNV = " + maNV + ",Ho Ten = " + hoTen + ",Luong Co Ban = " + luongCoBan;
//    }

    public void hienthiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }

    public abstract void hienThiThongTin();
}
