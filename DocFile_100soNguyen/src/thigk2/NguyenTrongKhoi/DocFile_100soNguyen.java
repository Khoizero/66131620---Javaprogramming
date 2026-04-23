package thigk2.NguyenTrongKhoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DocFile_100soNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        //Nhập dữ liệu mã số sinh viên
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cuối MSSV của bạn: ");
        int X = sc.nextInt();

        //Mở file để đọc dữ liệu
        File f = new File("100so.txt");
        Scanner docFile = new Scanner(f);

        boolean timThay = false;
        System.out.println("--- Danh sách số trong file ---");

        //Duyệt file và so sánh với X
        while (docFile.hasNextInt()) {
            int so = docFile.nextInt();
            System.out.print(so + " ");

            if (so == X) {
                timThay = true;
            }
        }

        //Đóng file và thông báo
        docFile.close();
        System.out.println("\n\n=> Kết quả: " + (timThay ? "Tìm thấy số " + X : "Không tìm thấy số " + X));
    }
}