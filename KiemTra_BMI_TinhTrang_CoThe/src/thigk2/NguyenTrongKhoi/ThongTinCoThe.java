package thigk2.NguyenTrongKhoi;

import java.util.Scanner;

public class ThongTinCoThe {
    public static void main(String[] args){
        //Khai báo và nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng(kg): ");
        double canNang = sc.nextDouble();
        System.out.println("Nhập chiều cao(m): ");
        double chieuCao = sc.nextDouble();

        //BMI = Cân nặng (kg) / (Chiều cao (m) * Chiều cao (m))
        double bmi = canNang / (chieuCao * chieuCao);

        System.out.println("Cân nặng: " + canNang + "kg");
        System.out.println("Chiều cao: " + chieuCao + " m");
        System.out.println("Chỉ số BMI: " + bmi);

        //Phân loại BMI
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }
    }
}
