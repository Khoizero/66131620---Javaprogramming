import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class B3_BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== NHẬP THÔNG TIN SINH VIÊN ===");
        System.out.print("Mã sinh viên: ");
        String id = scanner.nextLine();

        System.out.print("Họ tên: ");
        String name = scanner.nextLine();

        System.out.print("Điểm Toán: ");
        double math = scanner.nextDouble();

        System.out.print("Điểm Lý: ");
        double physics = scanner.nextDouble();

        System.out.print("Điểm Hóa: ");
        double chemistry = scanner.nextDouble();

        double average = (math + physics + chemistry) / 3;

        //Ghi vào file
        try {
            FileWriter wr = new FileWriter("sinhvien.txt", true);
            wr.write("=== SINH VIÊN ===\n");
            wr.write("Mã SV: " + id + "\n");
            wr.write("Họ tên: " + name + "\n");
            wr.write(String.format("Điểm Toán: %.1f\n", math));
            wr.write(String.format("Điểm Lý: %.1f\n", physics));
            wr.write(String.format("Điểm Hóa: %.1f\n", chemistry));
            wr.write(String.format("Điểm TB: %.2f\n", average));
            wr.write("=================\n\n");
            wr.close();
            System.out.println("\nĐã lưu thông tin vào file sinhvien.txt");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }

        scanner.close();
    }
}

