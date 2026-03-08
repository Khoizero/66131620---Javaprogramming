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
        String math = scanner.nextLine();

        System.out.print("Điểm Lý: ");
        String physics = scanner.nextLine();

        System.out.print("Điểm Hóa: ");
        String chemistry = scanner.nextLine();

        double average = (math + physics + chemistry) / 3;

        //Ghi vào file
        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("=== SINH VIÊN ===\n");
            writer.write("Mã SV: " + id + "\n");
            writer.write("Họ tên: " + name + "\n");
            writer.write(String.format("Điểm Toán: PT.1f\n", math));
            writer.write(String.format("Điểm Lý: PT.1f\n", physics));
            writer.write(String.format("Điểm Hóa: PT.1f\n", chemistry));
            writer.write(String.format("Điểm TB: PT.2f\n", average));
            writer.write("=================\n\n");
            writer.close();
            System.out.println("\nĐã lưu thông tin vào file students.txt");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }

        scanner.close();
    }
}

