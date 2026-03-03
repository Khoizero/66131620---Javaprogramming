public class Tinh_tien_luong {
    public static void main(String[] args){

        //Nhập số giờ làm và lương theo giờ
        double So_gio_lam = 60;
        double Luong_theo_h = 200000;
        double Tong_luong;

        //Tính tổng lương & Nếu làm trên 40h những giờ vượt tính 1.5 lần
        if (So_gio_lam <= 40){
            Tong_luong = So_gio_lam * Luong_theo_h;
        } else {
            double Gio_bth = 40;
            double Gio_vm = So_gio_lam - Gio_bth;

            Tong_luong = (Gio_bth * Luong_theo_h) + (Gio_vm * Luong_theo_h * 1.5);
        }

        //Xuất kết quả
        System.out.printf("Tổng tiền lương nhân viên nhận được là: %2f\n", Tong_luong);
    }
}
