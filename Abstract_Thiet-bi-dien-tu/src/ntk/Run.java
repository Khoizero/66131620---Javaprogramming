package ntk;

public class Run {
    public static void main(String[] args) {
        DienThoaiThongMinh dt = new DienThoaiThongMinh("iPhone 15", 25000000, "Apple");
        MayTinhBang mtb = new MayTinhBang("iPad Pro", 20000000, "Apple");
        Laptop lt = new Laptop("Dell XPS", 35000000, "Dell");

        // Kiểm tra tính năng
        dt.hienthiThongTin();
        dt.bat();
        dt.ketNoiWifi();
        dt.vuot();

        System.out.println("---");

        lt.hienthiThongTin();
        lt.bat();
        lt.ketNoiWifi();
        // lt.cham(); // Lỗi vì Laptop trong code này không implement CoTheCamUng
    }
}
