package ntk;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class vidu_docStream {
    public static void main(String[] args) throws IOException {

        //Đọc dữ liệu từ bàn phím
        //Khai báo biến đối tượng InputStreamReader
        InputStreamReader ipReader = new InputStreamReader(System.in);
        //Khai báo biến đối tượng Buffer
        BufferedReader buffReader = new BufferedReader(ipReader);

        //In một câu hướng dẫn để User biết cần làm gì
        System.out.print("Nhập một chuỗi bất kì: ");
        //Đọc dữ liệu từ bàn phím, cất vào biến chuỗi
        String lineDocDuoc = buffReader.readLine();
        //In ra dòng đọc
        System.out.println(lineDocDuoc);

        //Đọc dữ liệu từ file
        FileInputStream fInput = new FileInputStream("src/ntk/VanBan.txt");
        //Khai báo biến đối tượng InputStreamReader
        InputStreamReader ipR = new InputStreamReader(fInput);
        //Khai báo biến đối tượng Buffer
        BufferedReader buffR = new BufferedReader(ipR);
        //Line 1
        String line1 = buffR.readLine();
        System.out.println(line1);
        //Line 2
        String line2 = buffR.readLine();
        System.out.println(line2);
        //Line 3
        String line3 = buffR.readLine();
        System.out.println(line3);
    }
}
