package ntk;

class DienThoaiThongMinh extends ThietBiDienTu implements ThietBiDienTu.CoTheKetNoiInternet, ThietBiDienTu.CoTheCamUng {
    public DienThoaiThongMinh(String ten, double gia, String hangSanXuat) {
        super(ten, gia, hangSanXuat);
    }

    @Override void bat() { System.out.println(ten + " đang khởi động..."); }
    @Override void tat() { System.out.println(ten + " đang tắt nguồn."); }

    @Override public void ketNoiWifi() { System.out.println(ten + " đã kết nối Wifi thành công."); }
    @Override public void ngatKetNoi() { System.out.println(ten + " đã ngắt kết nối."); }

    @Override public void cham() { System.out.println("Bạn vừa chạm vào màn hình " + ten); }
    @Override public void vuot() { System.out.println("Đang vuốt màn hình " + ten); }
}

// 5. Tạo lớp MayTinhBang và Laptop với các chức năng phù hợp
class MayTinhBang extends ThietBiDienTu implements ThietBiDienTu.CoTheKetNoiInternet, ThietBiDienTu.CoTheCamUng {
    public MayTinhBang(String ten, double gia, String hangSanXuat) {
        super(ten, gia, hangSanXuat);
    }

    @Override void bat() { System.out.println("Mở màn hình máy tính bảng " + ten); }
    @Override void tat() { System.out.println("Tắt máy tính bảng " + ten); }

    @Override public void ketNoiWifi() { System.out.println(ten + " đang tìm kiếm mạng..."); }
    @Override public void ngatKetNoi() { System.out.println(ten + " đã ngoại tuyến."); }

    @Override public void cham() { System.out.println("Chạm đa điểm trên " + ten); }
    @Override public void vuot() { System.out.println("Cuộn trang trên " + ten); }
}

class Laptop extends ThietBiDienTu implements ThietBiDienTu.CoTheKetNoiInternet {
    public Laptop(String ten, double gia, String hangSanXuat) {
        super(ten, gia, hangSanXuat);
    }

    @Override void bat() { System.out.println("Laptop " + ten + " đang load Windows..."); }
    @Override void tat() { System.out.println("Laptop " + ten + " đang Shutting down..."); }

    @Override public void ketNoiWifi() { System.out.println("Laptop " + ten + " đã cắm dây LAN hoặc Wifi."); }
    @Override public void ngatKetNoi() { System.out.println("Mất kết nối Internet trên " + ten); }
}
