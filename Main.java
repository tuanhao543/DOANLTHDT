 package qlkhodienthoai.doan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            QuanLyKho a= new QuanLyKho(); 
            DienThoai b;         
            int n; 
            Scanner sc= new Scanner(System.in); 
            do { 
                a.menuChinh();             
                System.out.print("Mời lựa chọn: "); 
                n= sc.nextInt(); 
                switch(n)             
                {                 
                    case 1: { 
                    b= new DienThoaiDiDong(); 
                    a.themDSDienThoai(b); 
                    break;                 
                    }                 
                    case 2: { 
                    b= new DienThoaiThongMinh(); 
                    a.themDSDienThoai(b); 
                    break;                 
                    }                 
                    case 3: { 
                    a.hienDSDienThoaiDiDong();
                    break;                 
                    }                 
                    case 4: { 
                    a.hienDSDienThoaiThongMinh();
                    break; 
                    }                 
                    case 5: { 
                    a.SuaDoi();                     
                    break;                 
                    }                                  
                    case 6: {                      
                    System.out.print("Nhap gia nhap toi da: ");                     
                    float giaNhap = sc.nextFloat(); 
                    a.hienDSDienThoaiDiDongTheoGiaNhap( giaBan);                     
                    break;                 
                    }
                    case 7: {                      
                    System.out.print("Nhap gia nhap toi da: ");                     
                    float giaNhap = sc.nextFloat(); 
                    a.hienDSDienThoaiThongMinhTheoGiaNhap( giaBan);                     
                    break;                 
                    }
                    default:                     
                    break; 
            } 
        } 
        while(n!=0); 
    }
    }

            
