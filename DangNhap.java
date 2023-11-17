import java.util.ArrayList;
import java.util.Scanner;

public class DangNhap {
    Scanner sc = new Scanner(System.in);

    String tenDN,matKhau;

    public void setTenDN(String tenDN){

        this.tenDN = tenDN;
    }
    public String getTenDN(){

        return tenDN;
    }
    public void setMatKhau(String matKhau){

        this.matKhau = matKhau;
    }
    public String getMatKhau(){

        return matKhau;
    }
    public DangNhap(ArrayList<Sach> thuVien){
        System.out.print("Tên đăng nhập: ");
        tenDN = sc.nextLine();
        if(getTenDN().equals("admin")){
            System.out.print("Nhập mật khẩu: ");
            matKhau = sc.nextLine();
            if(getMatKhau().equals("admin")){
                System.out.println("Đăng nhập thành công!\n");
                Admin admin = new Admin();
                admin.chucNangAdmin(thuVien);

                }
            else System.out.println("Không thể truy cập");
            }
        else if(getTenDN().equals("khach")){
            Khach khach = new Khach();
            khach.ChucNangKhach(thuVien);
        }
    }
}
