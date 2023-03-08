package cau2;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        NhanVien kt1 = new KyThuat("KT6","Phan Thi Hanh", "12/08/2000","PT", "CNTT");
        System.out.println(kt1);
        System.out.println(kt1.moTaCongViec());

        // Input
        Scanner in = new Scanner(System.in);
        System.out.print("nhap ma: ");
        String maNhanVien = in.nextLine();
        System.out.print("nhap ho ten: ");
        String hoTen = in.nextLine();
        System.out.print("nhap nam sinh: ");
        String namSinh = in.nextLine();
        System.out.print("nhap dia chi: ");
        String diaChi = in.nextLine();
        System.out.print("nhap chuyen nganh: ");
        String chuyenNganh = in.nextLine();

        NhanVien kt2 = new KyThuat(maNhanVien,hoTen, namSinh, diaChi, chuyenNganh);
        System.out.println(kt2);
        System.out.println(kt2.moTaCongViec());

    }
    }

