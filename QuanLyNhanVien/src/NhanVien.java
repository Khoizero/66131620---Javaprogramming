public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    private double tinhLuong;
    private String xepLoai;

    //constructor default
    public NhanVien() {
        this.maNV = "empty";
        this.hoTen = "empty";
        this.luongCoBan = 0;
        this.heSoLuong = 0;
    }

    //constructor
    public NhanVien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    //setter
    public void setMaNV(String maNV) {
        if(maNV != null && !maNV.trim().isEmpty()) {
            this.maNV = maNV;
        } else {
            System.out.println("Ma nhan vien khong hop le");
        }
    }

    public void setHoTen(String hoTen) {
        if(hoTen != null && !hoTen.trim().isEmpty()) {
            this.hoTen = hoTen;
        } else {
            System.out.println("Ho ten khong hop le");
        }
    }

    public void setLuongCoBan(double luongCoBan) {
        if(!(luongCoBan <= 0)) {
            this.luongCoBan = luongCoBan;
        } else {
            this.luongCoBan = 0;
        }
    }

    public void setHeSoLuong(double heSoLuong) {
        if(!(heSoLuong <= 0)) {
            this.heSoLuong = heSoLuong;
        } else {
            this.heSoLuong = 0;
        }
    }

    public void tinhLuong() {
        tinhLuong = getLuongCoBan()*getHeSoLuong();
    }

    public void xepLoai() {
        if(tinhLuong >= 20000000) {
            this.xepLoai = "Xuat sac";
        } else if(tinhLuong >= 15000000) {
            this.xepLoai = "Gioi";
        } else {
            this.xepLoai = "Kha";
        }
    }

    public void hienThiThongTin() {
        System.out.println("Nhan Vien - Ma: " + getMaNV() + " | Ten: " + getHoTen() + " | Luong: " + luongCoBan + " | He so: " + heSoLuong + " | Tong luong: " + tinhLuong + " | Xep hang: " + xepLoai);
    }
}
