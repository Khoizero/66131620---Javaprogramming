import java.util.Scanner;

public class Quy_doi_tien_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhập dữ liệu
        System.out.print("Nhập số tiền USD: ");
        double sotien_USD = sc.nextDouble();
        System.out.print("Nhập số tiền Euro: ");
        double sotien_EUR = sc.nextDouble();

        double Ti_giaUSD = 23500;  //Tỉ giá USD
        double Ti_giaEUR = 27000;  //Tỉ giá Euro

        //Tính toán
        double USD_toVND = sotien_USD * Ti_giaUSD;
        double EUR_toVND = sotien_EUR * Ti_giaEUR;

        //Xuất kết quả
        System.out.println(sotien_USD + " USD đổi được: " + USD_toVND + " VND");
        System.out.println(sotien_EUR + " EUR đổi được: " + EUR_toVND + " VND");

        sc.close();
    }
}
