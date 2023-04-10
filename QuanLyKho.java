package qlkhodienthoai.doan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class QuanLyKho {

    ArrayList<DienThoai> phone; 
    ArrayList<DienThoaiDiDong>dsGiaDienThoaiDiDong;
    ArrayList<DienThoaiThongMinh>dsGiaDienThoaiThongMinh;
    ArrayList<KhoHangDienThoai>dtDatYeuCauGiaBan; 
 
    public QuanLyKho() { 
        phone = new ArrayList<>(); 
    } 
 
    public void themDSDienThoai(DienThoai a) {         
        Scanner sc = new Scanner(System.in);         
        System.out.print("Số lượng điện thoại cần thêm: "); 
        int n = sc.nextInt();         
        for (int i = 0; i < n; i++) { 
            System.out.println("Nhập điện thoại thứ " + (i + 1) + ": ");             
            if (a instanceof DienThoaiDiDong) {                 
                a = new DienThoaiDiDong();                 
                a.nhap(); 
            } 
            else if (a instanceof DienThoaiThongMinh) {                 
                a = new DienThoaiThongMinh();                 
                a.nhap();             
                } 
            phone.add(a); 
        } 
    } 
 
    public void menuSuaDoi(){
            System.out.println("------------- Mời lựa chọn -----------"); 
            System.out.println("1. Sửa thông tin điện thoại di động"); 
            System.out.println("2. Xóa điện thoại di động"); 
            System.out.println("3. Sửa thông tin điện thoại thông minh"); 
            System.out.println("4. Xóa thông tin điện thoại thông minh"); 
            System.out.println("5. Sửa thông tin điện thoại di động trong kho hàng"); 
            System.out.println("6. Thêm thông tin điện thoại di động trong kho hàng"); 
            System.out.println("7. Xóa thông tin điện thoại di động trong kho hàng");
            System.out.println("8. Sửa thông tin điện thoại thông minh trong kho hàng"); 
            System.out.println("9. Thêm thông tin điện thoại thông minh trong kho hàng"); 
            System.out.println("10. Xóa thông tin điện thoại thông minh trong kho hàng");
            System.out.println("----------- Nhấn phím 0 để thoát ----------");
        }
        public void SuaDoi(){
            Scanner sc = new Scanner(System.in);
            int n;
            do{
                menuSuaDoi();
                System.out.println("Chọn:");
                n = sc.nextInt();
                switch (n){
                    case 1:{
                        String model;
                        System.out.println("Nhập số model của điện thoại di động cần sửa:");
                        sc.nextLine();
                        model = sc.nextLine();
                        suaDienThoaiDiDong(model);
                        break;
                    }
                    case 2:{
                        String model;
                        System.out.println("Nhập số model của điện thoại di động cần xóa:");
                        sc.nextLine();
                        model = sc.nextLine();
                        xoaDienThoaiDiDong(model);
                        break;
                    }
                    case 3:{
                        String seri;
                        System.out.println("Nhập số seri của điện thoại di động cần sửa:");
                        sc.nextLine();
                        seri = sc.nextLine();
                        suaDienThoaiThongMinh(seri);
                        break;
                    }
                    case 4:{
                        String seri;
                        System.out.println("Nhập số seri của điện thoại di động cần xóa:");
                        sc.nextLine();
                        seri = sc.nextLine();
                        xoaDienThoaiThongMinh(seri);
                        break;
                    }
                    case 5:{
                        System.out.println("Nhập số model của điện thoại di động trong kho hàng:");
                        sc.nextLine();
                        String model = sc.nextLine();
                        System.out.println("Nhập mã kho hàng điện thoại di động:");
                        Double maHangDienThoai = sc.nextDouble();
                        suaKhoHangDTDD(maHangDienThoai, model);
                        break;
                    }
                    case 6:{
                        System.out.println("Nhập số model của điện thoại di động:");
                        sc.nextDouble();
                        String model = sc.nextLine();
                        themKhoHangDTDD( model);
                        break;
                    }
                    case 7:{
                        System.out.println("Nhập số model của điện thoại di động trong kho hàng:");
                        sc.nextLine();
                        String model = sc.nextLine();
                        System.out.println("Nhập mã kho hàng điện thoại di động:");
                        Double maHangDienThoai = sc.nextDouble();
                        xoaKhoHangDTDD(maHangDienThoai, model);
                        break;
                    }
                    case 8:{
                        System.out.println("Nhập số model của điện thoại thông minh trong kho hàng:");
                        sc.nextLine();
                        String seri = sc.nextLine();
                        System.out.println("Nhập mã kho hàng điện thoại thông minh:");
                        Double maHangDienThoai = sc.nextDouble();
                        suaKhoHangDTTM(maHangDienThoai, seri);
                        break;
                    }
                    case 9:{
                        System.out.println("Nhập số model của điện thoại thông minh:");
                        sc.nextLine();
                        String seri = sc.nextLine();
                        themKhoHangDTTM( seri);
                        break;
                    }
                    case 10:{
                        System.out.println("Nhập số model của điện thoại thông minh trong kho hàng:");
                        sc.nextLine();
                        String seri = sc.nextLine();
                        System.out.println("Nhập mã kho hàng điện thoại di động:");
                        Double maHangDienThoai = sc.nextDouble();
                        xoaKhoHangDTTM(maHangDienThoai, seri);
                        break;
                    }
                    default:
                break;
                }
            }
            while(n!=0);
        }
        public void suaKhoHangDTTM(Double maHangDienThoai, String seri){
            for(DienThoai x : phone){
                if(((DienThoaiThongMinh)x).getSoSeri().compareTo(seri)==0){
                    for(int i=0;i<((DienThoaiThongMinh)x).getKhdttm().size();i++){
                        if(Objects.equals(((DienThoaiThongMinh)x).getKhdttm().get(i).getMaKhoHangDienThoai(), maHangDienThoai)) { 
                            ((DienThoaiThongMinh) x).getKhdttm().get(i).nhapKhoHangDienThoai();

                        }
                    }
                }
            }
        }
        public void xoaKhoHangDTTM(Double maHangDienThoai, String seri) {         
            for (DienThoai x : phone) { 
                if (((DienThoaiThongMinh) x).getSoSeri().compareTo(seri) == 0) { 
                    for (int i = 0;i<((DienThoaiThongMinh) x).getKhdttm().size(); i++) {                     
                            if (Objects.equals(((DienThoaiThongMinh) x).getKhdttm().get(i).getMaKhoHangDienThoai(), maHangDienThoai)) { 
                                ((DienThoaiThongMinh) x).getKhdttm().remove(i); 
                        } 
                    } 
                } 
            } 
        } 

        public void themKhoHangDTTM(String seri) { 
            for (DienThoai x : phone) {             
                if (x instanceof DienThoaiThongMinh) { 
                ((DienThoaiThongMinh) x).nhapDSKhoHangDienThoaiThongMinh();
                } 
            } 
        }
        public void suaKhoHangDTDD(Double maHangDienThoai, String model){
            for(DienThoai x : phone){
                if(((DienThoaiDiDong)x).getSoModel().compareTo(model)==0){
                    for(int i=0;i<((DienThoaiDiDong)x).getKhdtdd().size();i++){
                        if(Objects.equals(((DienThoaiDiDong)x).getKhdtdd().get(i).getMaKhoHangDienThoai(), maHangDienThoai)) { 
                            ((DienThoaiDiDong) x).getKhdtdd().get(i).nhapKhoHangDienThoai();

                        }
                    }
                }
            }
        }
        public void xoaKhoHangDTDD(Double maHangDienThoai, String model) {         
            for (DienThoai x : phone) { 
                if (((DienThoaiDiDong) x).getSoModel().compareTo(model) == 0) { 
                    for (int i = 0;i<((DienThoaiDiDong) x).getKhdtdd().size(); i++) {                     
                            if (Objects.equals(((DienThoaiDiDong) x).getKhdtdd().get(i).getMaKhoHangDienThoai(), maHangDienThoai)) { 
                                ((DienThoaiDiDong) x).getKhdtdd().remove(i); 
                        } 
                    } 
                } 
            } 
        } 

        public void themKhoHangDTDD(String model) { 
            for (DienThoai x : phone) {             
                if (x instanceof DienThoaiDiDong) { 
                ((DienThoaiDiDong) x).nhapDSKhoHangDienThoaiDiDong();
                } 
            } 
        }
        public void suaDienThoaiDiDong(String model) {         
            for (DienThoai x : phone) {             
                if (x instanceof DienThoaiDiDong) { 
                    if (0 != ((DienThoaiDiDong) x).getSoModel().compareTo(model)) { 
                    } else { 
                        x.nhap();
                    } 
                } 
            } 
        }
        public void xoaDienThoaiDiDong(String model) {         
            for (DienThoai x : phone) {             
                if (x instanceof DienThoaiDiDong) { 
                    if (((DienThoaiDiDong) x).getSoModel().compareTo(model) == 0) {                     
                        phone.remove(x); 
                    } 
                } 
            } 
        } 
 
    public void suaDienThoaiThongMinh(String seri) { 
        for (DienThoai x : phone) {             
            if (x instanceof DienThoaiThongMinh) { 
                if (((DienThoaiThongMinh) x).getSoSeri().compareTo(seri) == 0) { 
                    x.nhap(); 
                } 
            } 
        } 
    } 
 
    public void xoaDienThoaiThongMinh(String seri) { 
        for (DienThoai x : phone) {             
            if (x instanceof DienThoaiThongMinh) { 
                if (((DienThoaiThongMinh) x).getSoSeri().compareTo(seri) == 0) {                     
                    phone.remove(x); 
                } 
            } 
        } 
    } 
 
    public void hienDSDienThoaiDiDong() { 
        System.out.println("----------------------------------------------");          
            for (DienThoai x : phone) { 
                if (x instanceof DienThoaiDiDong) {                 
                    x.hien(); 
            } 
        } 
    } 
 
    public void hienDSDienThoai() { 
        System.out.println("----------------------------------------------");         
            for (DienThoai x : phone) {             
                x.hien(); 
            } 
    } 
 
    public void hienDSDienThoaiThongMinh() { 
        System.out.println("----------------------------------------------");         
            for (DienThoai x : phone) {             
                if (x instanceof DienThoaiThongMinh) {                 
                    x.hien(); 
            } 
        } 
    } 
    

 
        public void hienDSDienThoaiDiDongTheoGiaBan(float gia) {         
        dsGiaDienThoaiDiDong = new ArrayList<>();         
        dtDatYeuCauGiaBan= new ArrayList<>(); 
        for (DienThoai x : phone) {             
            if (x instanceof DienThoaiDiDong) { 
                for (int i = 0; i < ((DienThoaiDiDong) x).getKhdtdd().size(); i++) {                     
                    if (((DienThoaiDiDong) x).getKhdtdd().get(i).getGiaBan() <= gia) { 
                        ((DienThoaiDiDong) x).hienThongTinDienThoaiDiDong();
                        ((DienThoaiDiDong) x).getKhdtdd().get(i).hienKhoHangDienThoai();
                        dsGiaDienThoaiDiDong.add((DienThoaiDiDong) x);                         
                        dtDatYeuCauGiaBan.add(((DienThoaiDiDong) x).getKhdtdd().get(i)); 
                    } 
                } 
            } 
        } 
    }
    public void hienDSDienThoaiThongMinhTheoGiaBan( float gia) {         
        dsGiaDienThoaiThongMinh = new ArrayList<>();         
        dtDatYeuCauGiaBan= new ArrayList<>(); 
        for (DienThoai x : phone) {             
            if (x instanceof DienThoaiThongMinh) { 
                for (int i = 0; i < ((DienThoaiThongMinh) x).getKhdttm().size(); i++) {                     
                    if (((DienThoaiThongMinh) x).getKhdttm().get(i).getGiaBan() <= gia) { 
                        ((DienThoaiThongMinh) x).hienThongTinDienThoaiThongMinh();
                        ((DienThoaiThongMinh) x).getKhdttm().get(i).hienKhoHangDienThoai();
                        dsGiaDienThoaiThongMinh.add((DienThoaiThongMinh) x);                         
                        dtDatYeuCauGiaBan.add(((DienThoaiThongMinh) x).getKhdttm().get(i)); 
                    } 
                } 
            } 
        } 
    }
    public void hienDSDatYeuCau()
    { 
        for(KhoHangDienThoai x: dtDatYeuCauGiaBan) 
        { 
            x.hienKhoHangDienThoai();
        } 
    } 
    public void menuChinh() { 
        System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ KHO DIỆN THOẠI------"); 
        System.out.println("1. Nhập danh sách diện thoại di động và kho hàng của điện thoại di động"); 
        System.out.println("2. Nhập danh sách diện thoai thông minh và kho hàng của điện thoại thông minh"); 
        System.out.println("3. Hiển thị danh sách các điện thoại di động"); 
        System.out.println("4. Hiển thị danh sách các điện thoại thông minh"); 
        System.out.println("5. Chỉnh sửa thông tin");  
        System.out.println("6. Hiện ra danh sách điện thoại di động có giá bán tối đa theo yêu cầu ( input: gia ban)");
        System.out.println("7. Hiện ra danh sách điện thoại thông minh có giá bán tối đa theo yêu cầu ( input: gia ban)"); 
        System.out.println("-----Nhấn phím 0 để thoát chương trình-----"); 
    } 
}
