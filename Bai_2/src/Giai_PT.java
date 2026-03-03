import java.util.Scanner;

public class Giai_PT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Nhập dữ liệu
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();

        //Tính toán
        if (a == 0){
           if (b == 0) {
               System.out.println("Phương trình vô số nghiệm.");
           } else {
               System.out.println("Phương trình vô nghiệm.");
           }
        } else {
            //Công thức tính nghiệm x = - b / a
            double x = - b / a;
            System.out.printf("Phương trình có một nghiệm duy nhất là: x = %2f\n", x);
        }
        sc.close();
    }
}
