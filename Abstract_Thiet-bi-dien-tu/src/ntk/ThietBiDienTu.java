package ntk;

abstract class ThietBiDienTu {
    protected String ten;
    protected double gia;
    protected String hangSanXuat;

    public ThietBiDienTu(String ten, double gia, String hangSanXuat) {
        this.ten = ten;
        this.gia = gia;
        this.hangSanXuat = hangSanXuat;
    }

    abstract void bat();
    abstract void tat();

    public void hienthiThongTin() {
        System.out.println("Tên: " + ten + " | Gía: " + gia + " | Hãng: " + hangSanXuat);
    }

    interface CoTheKetNoiInternet {
        void ketNoiWifi();
        void ngatKetNoi();
    }

    interface CoTheCamUng {
        void cham();
        void vuot();
    }
}
