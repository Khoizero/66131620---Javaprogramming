package ntk.quanlynhanvien;

public class NhanVien {
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

    public double TinhLuong() {
        return luongCoBan;
    }

    @Override
    public String toString() {
        return "Nhan Vien [maNV=" + maNV + ",hoTen=" + hoTen + ",luongCoBan =" + luongCoBan;
    }

    public void hienthiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
}
