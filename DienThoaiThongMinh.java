package qlkhodienthoai.doan;
import java.util.ArrayList;
import java.util.Scanner;

public class DienThoaiThongMinh extends DienThoai{
    private String soSeri,loaiManHinh, Camera, loaiTanNhiet, tinhNangDacBiet;
    private ArrayList<KhoHangDienThoai>khdttm;
    KhoHangDienThoai khohangdienthoaithongminh;
    public DienThoaiThongMinh(){
        super();
    }
    public DienThoaiThongMinh(String tenDienThoai, String soSeri, String loaiManHinh, String Camera, String loaiTanNhiet, String tinhNangDacBiet, String mauSac, String heDieuHanh, String thongSoKT){
        super(tenDienThoai, mauSac, heDieuHanh, thongSoKT);
        this.soSeri= soSeri;
        this.loaiManHinh= loaiManHinh;
        this.Camera= Camera;
        this.loaiTanNhiet= loaiTanNhiet;
        this.tinhNangDacBiet= tinhNangDacBiet;
    }
    public String getSoSeri() 
    { 
        return soSeri; 
    }
    public void setSoSeri(String soSeri) 
    { 
        this.soSeri = soSeri; 
    } 
    public String getLoaiManHinh(){
        return loaiManHinh;
    }
    public void setLoaiManHinh(String loaiManHinh){
        this.loaiManHinh= loaiManHinh;
    }
    public String getCamera(){
        return Camera;
    }
    public void setCamera(String Camera){
        this.Camera= Camera;
    }
    public String getLoaiTanNhiet(){
        return loaiTanNhiet;
    }
    public void setLoaiTanNhiet(String loaiTanNhiet){
        this.loaiTanNhiet= loaiTanNhiet;
    }
    public String getTinhNangDacBiet(){
        return tinhNangDacBiet;
    }
    public void setTinhNangDacBiet(String tinhNangDacBiet){
        this.tinhNangDacBiet= tinhNangDacBiet;
    }
    public ArrayList<KhoHangDienThoai>getKhdttm(){
        return khdttm;
    }
    public void setKhdttm(ArrayList<KhoHangDienThoai>khdttm){
        this.khdttm= khdttm;
    }
    public KhoHangDienThoai getKhohangdienthoaithongminh(){
        return khohangdienthoaithongminh;
    }
    public  void setKhohangdienthoaithongminh(KhoHangDienThoai khohangdienthoaithongminh){
        this.khohangdienthoaithongminh= khohangdienthoaithongminh;
    }
    @Override
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.println("Số Seri");
        soSeri=sc.nextLine();
        System.out.println("Loại màn hình");
        loaiManHinh= sc.nextLine();
        System.out.println("Camera");
        Camera= sc.nextLine();
        System.out.println("Loại tản nhiệt");
        loaiTanNhiet= sc.nextLine();
        System.out.println("Tính năng đặc biệt");
        tinhNangDacBiet= sc.nextLine();
        nhapDSKhoHangDienThoaiThongMinh();
    }
    public  void nhapDSKhoHangDienThoaiThongMinh(){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Nhập lượng điện thoại thông minh cần nhập vào kho hàng: ");         
        int n = sc.nextInt();         
        khdttm = new ArrayList<>();         
        for(int i=0; i<n; i++) 
        { 
            khohangdienthoaithongminh= new KhoHangDienThoai();             
            khohangdienthoaithongminh.nhapKhoHangDienThoai(); 
            khdttm.add(khohangdienthoaithongminh); 
        } 
    }
    public void hienDSKhoHangDienThoai() 
    { 
        for(KhoHangDienThoai x:  khdttm) 
        { 
            x.hienKhoHangDienThoai(); 
        } 
    }

    @Override
    public void hien()
    {
        super.hien();
        System.out.println("\nSố Seri:"+getSoSeri()+"\nLoại màn hình:"+ getLoaiManHinh()+"\nCamera"+ getCamera()+"\nLoại tản nhiệt"+ getLoaiTanNhiet()+"\nTính năng đặc biệt"+ getTinhNangDacBiet());
        hienDSKhoHangDienThoai();
    }
    public void hienThongTinDienThoaiThongMinh() 
    { 
        super.hien(); 
        System.out.println("\nTên điện thoại"+getTenDienThoai()+"\nMàu sắc:"+ getMauSac()+"\nHệ điều hành:"+ getHeDieuHanh()+"\nThông số kỹ thuật:"+ getThongSoKT()+"\nSố Seri:"+getSoSeri()+"\nLoại màn hình:"+ getLoaiManHinh()+"\nCamera"+ getCamera()+"\nLoại tản nhiệt"+ getLoaiTanNhiet()+"\nTính năng đặc biệt"+ getTinhNangDacBiet()); 
    } 
}
   
