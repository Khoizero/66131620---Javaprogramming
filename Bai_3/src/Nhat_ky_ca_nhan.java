import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.*;

public class Nhat_ky_ca_nhan {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String tenFile = "nhatky.txt";

        System.out.println("=== 1. Viết nhật ký | 2. Đọc nhật ký ===");
        int chon = sc.nextInt();
        sc.nextLine(); //Xóa đệm bộ nhớ

        if (chon == 1) {
            //Ghi File
            FileWriter fw = new FileWriter(tenFile, true);
            System.out.print("Nhập nội dung: ");
            String noiDung = sc.nextLine();

            fw.write(noiDung + "\n"); // Ghi chuỗi và xuống dòng
            fw.close();               // Phải đóng file thì dữ liệu mới lưu
            System.out.println("Đã lưu!");

        } else if (chon == 2) {
            //Đọc File
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner docFile = new Scanner(f);
                System.out.println("--- Nội dung nhật ký ---");
                while (docFile.hasNextLine()) {
                    System.out.println(docFile.nextLine());
                }
                docFile.close();
            } else {
                System.out.println("ERROR !!!");
            }
        }
    }
}
