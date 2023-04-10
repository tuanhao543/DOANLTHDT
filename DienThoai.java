package qlkhodienthoai.doan;
import java.util.Scanner;
public class DienThoai {
    private String mauSac, heDieuHanh, thongSoKT, tenDienThoai;
    public DienThoai()
    {

    }
    public DienThoai(String tenDienThoai, String mauSac, String heDieuHanh, String thongSoKT)
    {
        this.tenDienThoai= tenDienThoai;
        this.mauSac = mauSac;
        this.heDieuHanh = heDieuHanh;
        this.thongSoKT = thongSoKT;
    }
    public String getTenDienThoai() { 
        return tenDienThoai; 
    } 
     
    public void setTenDienThoai(String tenDienThoai  ) 
    { 
        this.tenDienThoai = tenDienThoai; 
    }
    public String getMauSac() { 
        return mauSac; 
    } 
 
    public void setMauSac(String mauSac  ) 
    { 
        this.mauSac = mauSac; 
    } 
     
    public String getHeDieuHanh() { 
        return heDieuHanh; 
    } 
 
    public void setHeDieuHanh(String heDieuHanh ) 
    { 
        this.heDieuHanh = heDieuHanh; 
    } 
    public String getThongSoKT() { 
        return thongSoKT; 
    } 
 
    public void setThongSoKT(String thongSoKT ) 
    { 
        this.thongSoKT = thongSoKT; 
    }
    
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Tên điện thoại");
        tenDienThoai=sc.nextLine();
        System.out.println("Màu sắc");
        mauSac=sc.nextLine();
        System.out.println("Hệ điều hành");
        heDieuHanh=sc.nextLine();
        System.out.println("Thông số kỹ thuật");
        thongSoKT=sc.nextLine();

    }
    public void hien()
    {
        System.out.println("\nTên điện thoại"+getTenDienThoai()+"\nMàu sắc:"+ getMauSac()+"\nHệ điều hành:"+ getHeDieuHanh()+"\nThông số kỹ thuật:"+ getThongSoKT());
    }
}    