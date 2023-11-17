import java.util.ArrayList;
import java.util.Scanner;
 public class Khach {
    Scanner sc = new Scanner(System.in);
     public void timKiemSach(ArrayList<Sach> thuVien){
         System.out.print("Nhập thông tin của sách: ");
         String x = sc.nextLine();
         int cnt = 0;
         for(int i = 0; i < thuVien.size() ; i++){
             if(thuVien.get(i).soSanh(x)){
                 cnt=1;
                 System.out.println(thuVien.get(i).getTieuDe());
                 System.out.println(thuVien.get(i).getTacGia());
                 System.out.println(thuVien.get(i).getTheLoai());
                 System.out.println(thuVien.get(i).getNgayXB());

             }
         }
         if(cnt == 0) System.out.println("Không thấy sách");
     }
     public void xemDS(ArrayList<Sach> thuVien){
         if(thuVien.size() == 0) System.out.println("Thư viện không có sách");
         else{
             for(int i = 0; i < thuVien.size(); i++){
                 System.out.println(thuVien.get(i).getTieuDe());
                 System.out.println(thuVien.get(i).getTacGia());
                 System.out.println(thuVien.get(i).getTheLoai());
                 System.out.println(thuVien.get(i).getNgayXB());

             }
         }
     }
    public void ChucNangKhach(ArrayList<Sach> thuVien){
        System.out.println("Chức năng của khách:");
        System.out.println("1. Tìm kiếm sách.");
        System.out.println("2. Xem danh sách sách.");
        System.out.println("3. Thoát tài khoản.");
        while(true){
            System.out.print("Nhập chức năng: ");
            int chucNang = sc.nextInt();
            sc.nextLine();
            switch(chucNang){
                case 1:
                    timKiemSach(thuVien);
                    break;
                case 2:
                    xemDS(thuVien);
                    break;
                default:
                    return ;
            }
        }
    }
}
