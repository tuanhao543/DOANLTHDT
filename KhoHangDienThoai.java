package qlkhodienthoai.doan;
import java.util.Scanner;
public class KhoHangDienThoai {
        private Double maKhoHangDienThoai, soLuong;
        private Float giaNhap;
        private int ngayNhapKho;
    public KhoHangDienThoai(){

    }
    public KhoHangDienThoai(String tenDienThoai, Float giaNhap, Double soLuong, Double maKhoHangDienThoai, int ngayNhapKho)
    {
        
        this.giaBan = giaNhap;
        this.maKhoHangDienThoai= maKhoHangDienThoai;
        this.soLuong= soLuong;
        this.ngayNhapKho= ngayNhapKho;
    }    
    
    public Float getGiaNhap() 
    { 
        return giaNhap; 
    } 
 
    public void setGiaNhap(Float giaNhap ) 
    { 
        this.giaNhap = giaNhap; 
    }
    public Double getMaKhoHangDienThoai()
        {
        return maKhoHangDienThoai;
        }
    public void setMaKhoHangDienThoai(Double maKhoHangDienThoai)
        {
        this.maKhoHangDienThoai = maKhoHangDienThoai;
        }
    public Double getSoLuong()
        {
        return soLuong;
        }
    public void setSoLuong(Double soLuong)
        {
        this.soLuong = soLuong;
        }
    public int getNgayNhapKho()
        {
        return ngayNhapKho;
        }
    public void setNgayNhapKho(int ngayNhapKho)
        {
        this.ngayNhapKho = ngayNhapKho;  
        }
    public void nhapKhoHangDienThoai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã kho hàng điện thoại: ");
        maKhoHangDienThoai = sc.nextDouble();
        System.out.println("Giá nhập");
        giaBan=sc.nextFloat();
        System.out.println("Số lượng: ");
        soLuong = sc.nextDouble();
        System.out.println("Ngày nhập kho: ");
        ngayNhapKho = sc.nextInt();
    }
    public void hienKhoHangDienThoai(){
        System.out.println("\nMa Kho Hang Dien Thoai:"+getMaKhoHangDienThoai()+"\nGia Nhap:"+ getGiaNhap()+"\nSo Luong:"+getSoLuong()+"\nNgay Nhap Kho:"+getNgayNhapKho());
    }
 }
