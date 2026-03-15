public class Main {
    public static void main(String[] args) {
        // test case 1:
        NhanVien nv1 = new NhanVien();
        nv1.setMaNV("FER174");
        nv1.setHoTen("Nguyen Huynh Hoa");
        nv1.setLuongCoBan(21000000);
        nv1.setHeSoLuong(1.5);
        nv1.tinhLuong();
        nv1.xepLoai();
        nv1.hienThiThongTin();

        // test case 2:
        NhanVien nv2 = new NhanVien();
        nv2.setMaNV("FER175");
        nv2.setHoTen("Nguyen Huynh Huy");
        nv2.setLuongCoBan(19999999);
        nv2.setHeSoLuong(1);
        nv2.tinhLuong();
        nv2.xepLoai();
        nv2.hienThiThongTin();

        // test case 3:
        NhanVien nv3 = new NhanVien();
        nv3.setMaNV("FER176");
        nv3.setHoTen("Nguyen Huynh Him");
        nv3.setLuongCoBan(14999999);
        nv3.setHeSoLuong(1);
        nv3.tinhLuong();
        nv3.xepLoai();
        nv3.hienThiThongTin();

        // test case 4:
        NhanVien nv4 = new NhanVien();
        nv4.setMaNV("");
        nv4.setHoTen("");
        nv4.setLuongCoBan(1);
        nv4.setHeSoLuong(1);
        nv4.tinhLuong();
        nv4.xepLoai();
        nv4.hienThiThongTin();
    }
}