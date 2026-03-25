package ntk.quanlynhanvien;

public class Run {
    public static void main() {
        NhanVien nv1 = new NhanVien("001", "Nguyen Van A", 5000000);
        nv1.hienthiThongTin();
        //System.out.print(nv1.toString());

        NhanVienVanPhong nv2 = new NhanVienVanPhong("002", "Nguyen Thi B", 9000000);
    }
}
