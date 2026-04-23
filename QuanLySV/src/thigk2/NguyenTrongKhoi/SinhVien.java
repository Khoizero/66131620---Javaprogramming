package thigk2.NguyenTrongKhoi;

public class SinhVien {
    //Khi báo thuộc tính
    private int mssv;
    private String hoTen;
    private int namSinh;
    private boolean gioiTinh;

    //Constructor
    public SinhVien() {}
    public SinhVien(int mssv, String hoTen, int namSinh, boolean gioiTinh) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    //getters và setters
    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "MSSV: " + mssv + " | Họ tên: " + hoTen +
                " | Năm sinh: " + namSinh + " | Giới tính: " + (gioiTinh ? "Nam" : "Nữ");
    }
}
