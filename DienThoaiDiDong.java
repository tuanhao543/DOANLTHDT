package qlkhodienthoai.doan;
import java.util.ArrayList;
import java.util.Scanner;
public class DienThoaiDiDong extends DienThoai
{
    private String soModel,loaiBanPhim;
    private ArrayList<KhoHangDienThoai>khdtdd;
    KhoHangDienThoai khohangdienthoaididong;
    public DienThoaiDiDong(){

    }
    public DienThoaiDiDong(String loaiBanPhim, String soModel,String tenDienThoai, String mauSac, String heDieuHanh, String thongSoKT){
        super(tenDienThoai, mauSac, heDieuHanh, thongSoKT);
        this.loaiBanPhim= loaiBanPhim;
        this.soModel= soModel;
    }  
    public String getLoaiBanPhim(){
        return loaiBanPhim;
    }
    public void setLoaiBanPhim(String loaiBanPhim){
        this.loaiBanPhim= loaiBanPhim;
    }
    public String getSoModel(){
        return soModel;
    }
    public void setSoModel(String soModel){
        this.soModel= soModel;
    }
    public ArrayList<KhoHangDienThoai>getKhdtdd(){
        return khdtdd;
    }
    public void setKhdtdd(ArrayList<KhoHangDienThoai>khdtdd){
        this.khdtdd= khdtdd;
    }
    public KhoHangDienThoai getKhohangdienthoaididong(){
        return khohangdienthoaididong;
    }
    public  void setKhohangdienthoaididong(KhoHangDienThoai khohangdienthoaididong){
        this.khohangdienthoaididong= khohangdienthoaididong;
    }    
    @Override
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.println("Loai Ban Phim");
        loaiBanPhim= sc.nextLine();
        System.out.println("So Model");
        soModel= sc.nextLine();
        nhapDSKhoHangDienThoaiDiDong();
    }
    public  void nhapDSKhoHangDienThoaiDiDong(){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Nhập lượng điện thoại di động cần nhập vào kho hàng: ");         
        int n = sc.nextInt();         
        khdtdd = new ArrayList<>();         
        for(int i=0; i<n; i++) 
        { 
            khohangdienthoaididong= new KhoHangDienThoai();             
            khohangdienthoaididong.nhapKhoHangDienThoai(); 
            khdtdd.add(khohangdienthoaididong); 
        } 
    }
    public void hienDSKhoHangDienThoai() 
    { 
        for(KhoHangDienThoai x:  khdtdd) 
        { 
            x.hienKhoHangDienThoai(); 
        } 
    }
    @Override
    public void hien(){
        super.hien();
        System.out.println("\nSố Model:"+ getSoModel()+"\nLoại bàn phím:"+ getLoaiBanPhim());
        hienDSKhoHangDienThoai();
    }   
    public void hienThongTinDienThoaiDiDong(){
        super.hien();
        System.out.println("\nTên điện thoại"+getTenDienThoai()+"\nMàu sắc:"+ getMauSac()+"\nHệ điều hành:"+ getHeDieuHanh()+"\nThông số kỹ thuật:"+ getThongSoKT()+"\nSố Model:"+ getSoModel()+"\nLoại bàn phím:"+ getLoaiBanPhim());
    }
}