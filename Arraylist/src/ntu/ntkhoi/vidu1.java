package ntu.ntkhoi;

import java.util.Scanner;
import java.util.ArrayList;

public class vidu1 {

    public static void main(String[] args) {
        //Khai báo biến danh sách, chứa các số nguyên
        ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
        Scanner kB = new Scanner(System.in);

        //a) Nhập 10 số nguyên ra màn hình
        for (int i = 1; i <= 10; i++) {
            //Nhập 1 phần tử
            System.out.print("Mời nhập phần tử thứ nhất" + i + ": ");
            System.out.print("a[" + i + "]= ");

            Integer tam = kB.nextInt();
            dsSoNguyen.add(tam);
        }

        //b) In ra màn hình danh sách vừa nhập
        System.out.print("DANH SÁCH VỪA NHẬP LÀ: ");
        for (int i = 0; i < dsSoNguyen.size(); i++) {
            Integer tam = dsSoNguyen.get(i);
            System.out.print(tam + " ");
        }

//        Cách 2
//        for(Integer x:dsSoNguyen) {
//            System.out.print(x + " ");
//        }

        //c) Đếm xem có bao nhiêu số chẵn
        int soLuongChan = 0;
        for (int i = 0; i < dsSoNguyen.size(); i++) {
            if (dsSoNguyen.get(i) % 2 == 0) soLuongChan++;
        }
        System.out.println("\nSo luong chan trong phan tu la: " + soLuongChan);

        //Cách 2
        //for(Integer x:dsSoNguyen){
        //  if(x % 2) soLuongChan++;
        //}

        //d) Tính tổng phần tử của danh sách
        int Tong = 0;
        for(Integer x:dsSoNguyen){
            Tong = Tong + x;
        }
        System.out.println("Tổng các phần tử trong mảng: " + Tong);
    }
}
