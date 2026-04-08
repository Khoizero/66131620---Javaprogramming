package ntk.quanli_hocsinh;

import java.util.Scanner;
import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Hoc sinh 1 - Hard_Code
        HocSinh hs1 = new HocSinh();
        hs1.setTenHS("Nguyễn Văn A");
        hs1.setTuoiHS(18);
        hs1.setLopHS("CNTT1");

        System.out.println(hs1);

//        //Hoc sinh 2 - Nhap tu ban phim
//        System.out.print("Nhap ten hoc sinh: \n");
//        String ten = scanner.nextLine();
//
//        System.out.print("Nhap tuoi hoc sinh: \n");
//        int tuoi = scanner.nextInt();
//
//        scanner.nextLine();
//        System.out.print("Nhap lop hoc sinh: \n");
//        String lop = scanner.nextLine();
//
//        HocSinh hs2 = new HocSinh(ten, tuoi , lop);
//        System.out.println(hs2);
//
        //In ra ds N hoc sinh
        ArrayList<HocSinh> danhsach = new ArrayList<>();

        System.out.println("Nhap so luong hoc sinh: ");
        int n = scanner.nextInt();
        scanner.nextLine(); //Xoa bo nho dem

        for (int i = 0; i < n; i++) {
            System.out.println("====Nhap hoc sinh thu " + (i + 1) + "====");

            System.out.print("Nhap ten hoc sinh: \n");
            String name = scanner.nextLine();

            System.out.print("Nhap tuoi hoc sinh: \n");
            int age = scanner.nextInt();

            scanner.nextLine();
            System.out.print("Nhap lop hoc sinh: \n");
            String HSclass = scanner.nextLine();
            System.out.println("=========================================");

            danhsach.add(new HocSinh(name, age , HSclass));
        }

        System.out.println("=====Danh sach vua nhap=====");
        for (HocSinh nhs : danhsach) {
            System.out.println(nhs);
        }

        //Bo sung HS
        System.out.println("====================");
        System.out.println("1. Nhap HS bo sung");
        System.out.println("2. Khong can nhap");
        int chon = scanner.nextInt();

        if(chon == 1) {
            System.out.println("====Nhap HS can bo sung====");
            System.out.print("Nhap ten HS: ");
            String tenBS = scanner.nextLine();
            System.out.print("Nhap tuoi HS: ");
            int tuoiBS = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhap lop HS: ");
            String lopBS = scanner.nextLine();

            danhsach.add(new HocSinh(tenBS, tuoiBS, lopBS));

            System.out.println("Danh sach sau khi bo sung:");
            for (HocSinh nhs : danhsach) {
                System.out.println(nhs);
            }
        }
        else if (chon == 2) {
            System.out.println("===Hoan tat===");
        }


        //Xoa hs ten Hoa
        System.out.println("====Xoa hoc sinh tên 'Hoa'====");
        for (int i = 0; i < danhsach.size(); i++) {
            // Lấy tên của học sinh tại vị trí i
            String tenHienTai = danhsach.get(i).gettenHS();

            if (tenHienTai.equalsIgnoreCase("Hoa")) {
                System.out.println("--> Da tim thay va Xoa: " + tenHienTai);
                danhsach.remove(i);

                // Quan trọng: Sau khi xóa, danh sách bị dồn lên,
                // ta cần giảm i để không bỏ sót phần tử tiếp theo
                i--;
            }
        }

        System.out.println("===Danh sach sau khi xu ly===");
        if (danhsach.isEmpty()) {
            System.out.println("---Danh sach trong---");
        } else {
            for (HocSinh nhs : danhsach) {
                System.out.println(nhs); // Sẽ gọi hàm toString() bạn đã viết
            }
        }

        scanner.close();
    }
}
