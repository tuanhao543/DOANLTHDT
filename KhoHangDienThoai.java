package qlkhodienthoai.doan;
import java.util.Scanner;
public class KhoHangDienThoai {
        private Double maKhoHangDienThoai, soLuong;
        private Float giaBan;
        private int ngayNhapKho, ngayXuatKho;
    public KhoHangDienThoai(){

    }
    public KhoHangDienThoai(String tenDienThoai, Float giaBan, Double soLuong, Double maKhoHangDienThoai, int ngayNhapKho, int ngayXuatKho)
    {
        
        this.giaBan = giaBan;
        this.maKhoHangDienThoai= maKhoHangDienThoai;
        this.soLuong= soLuong;
        this.ngayNhapKho= ngayNhapKho;
        this.ngayXuatKho= ngayXuatKho;
    }    
    
    public Float getGiaBan() 
    { 
        return giaBan; 
    } 
 
    public void setGiaBan(Float giaBan ) 
    { 
        this.giaBan = giaBan; 
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
    public int getNgayXuatKho()
        {
        return ngayXuatKho;
        }
    public void setNgayXuatKho(int ngayXuatKho)
        {
        this.ngayXuatKho = ngayXuatKho;
        }
    public void nhapKhoHangDienThoai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã kho hàng điện thoại: ");
        maKhoHangDienThoai = sc.nextDouble();
        System.out.println("Giá bán");
        giaBan=sc.nextFloat();
        System.out.println("Số lượng: ");
        soLuong = sc.nextDouble();
        System.out.println("Ngày nhập kho: ");
        ngayNhapKho = sc.nextInt();
        System.out.println("Ngày xuất kho:");
        ngayXuatKho = sc.nextInt();
    }
    public void hienKhoHangDienThoai(){
        System.out.println("\nMa Kho Hang Dien Thoai:"+getMaKhoHangDienThoai()+"\nGia Ban:"+ getGiaBan()+"\nSo Luong:"+getSoLuong()+"\nNgay Nhap Kho:"+getNgayNhapKho()+"\nNgay Xuat Kho:"+getNgayXuatKho());
    }
 }
