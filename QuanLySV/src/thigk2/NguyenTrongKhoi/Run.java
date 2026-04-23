package thigk2.NguyenTrongKhoi;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        //Tạo danh sách Sinh Vien
        ArrayList<SinhVien> danhSachSV = new ArrayList<>();

        //Hard-code dữ liệu 3 sinh viên
        SinhVien sv1 = new SinhVien(101, "Nguyễn Văn A", 2006, true);
        SinhVien sv2 = new SinhVien(102, "Trần Thị B", 2005, false);
        SinhVien sv3 = new SinhVien(103, "Lê Văn C", 2003, true);

        // Thêm vào danh sách
        danhSachSV.add(sv1);
        danhSachSV.add(sv2);
        danhSachSV.add(sv3);

        // In danh sách ra màn hình
        System.out.println("--- DANH SÁCH SINH VIÊN ---");
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }

        //Thêm mới một sinh viên vào danh sách
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- NHẬP THÔNG TIN SINH VIÊN MỚI ---");

        //Nhập thông tin sinh viên mới
        System.out.print("Nhập MSSV: ");
        int mssv = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập Họ tên: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhập Năm sinh: ");
        int namSinh = sc.nextInt();

        System.out.print("Nhập Giới tính (true - Nam / false - Nữ): ");
        boolean gioiTinh = sc.nextBoolean();

        // Tạo đối tượng mới và thêm vào danh sách
        SinhVien svMoi = new SinhVien(mssv, hoTen, namSinh, gioiTinh);
        danhSachSV.add(svMoi);

        // In lại danh sách vừa cập nhật
        System.out.println("\n--- DANH SÁCH SAU KHI CẬP NHẬT ---");
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }

        int namHienTai = LocalDate.now().getYear();
        System.out.println("\n--- SINH VIÊN TRÊN 20 TUỔI Ở NĂM " + namHienTai + " ---");
        for(SinhVien sv : danhSachSV) {
            int tuoi = namHienTai - sv.getNamSinh();

            if(tuoi > 20) {
                System.out.println(sv.getHoTen() + " - " + tuoi + " tuổi");
            }
        }
    }
}
