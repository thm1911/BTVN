
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    Scanner sc = new Scanner(System.in);
    private void themSach(ArrayList<Sach> thuVien){
        System.out.print("Tên sách: ");
        String tieuDe = sc.nextLine();
        System.out.print("Tác giả: ");
        String tacGia = sc.nextLine();
        System.out.print("Thể loại: ");
        String theLoai = sc.nextLine();
        System.out.print("Ngày xuất bản: ");
        String ngayXB = sc.nextLine();
        Sach sachMoi = new Sach(tieuDe,tacGia,theLoai,ngayXB);
        thuVien.add(sachMoi);
        System.out.println("Đã thêm sách");
    }
    private void xoaSach(ArrayList<Sach> thuVien){
        System.out.print("Nhập vị trí sách muốn xóa: ");
        int id = sc.nextInt();
        if(id < thuVien.size()){
            thuVien.remove(id);
            System.out.println("Đã xóa sách");
        }
        else System.out.println("Không thấy sách");
    }
    private void capNhatSach(ArrayList<Sach> thuVien){
        System.out.print("Nhập vị trí sách cần sửa: ");
        int id = sc.nextInt();
        sc.nextLine();
        if(id < thuVien.size()){
            System.out.print("Tên sách mới: ");
            String tieuDe = sc.nextLine();
            System.out.print("Tác giả mới: ");
            String tacGia = sc.nextLine();
            System.out.print("Thể loại mới: ");
            String theLoai = sc.nextLine();
            System.out.print("Ngày xuất bản mới: ");
            String ngayXB = sc.nextLine();
            thuVien.get(id).setTieuDe(tieuDe);
            thuVien.get(id).setTacGia(tacGia);
            thuVien.get(id).setTheLoai(theLoai);
            thuVien.get(id).setNgayXB(ngayXB);
            System.out.println("Đã cập nhật sách");
        }
        else System.out.println("Không thấy sách");
    }
    private void timKiemSach(ArrayList<Sach> thuVien){
        System.out.print("Nhập thông tin của sách: ");
        String key = sc.nextLine();
        int cnt = 0;
        for(int i = 0; i < thuVien.size() ; i++){
            if(thuVien.get(i).soSanh(key)){
                cnt=1;
                System.out.println(thuVien.get(i).getTieuDe());
                System.out.println(thuVien.get(i).getTacGia());
                System.out.println(thuVien.get(i).getTheLoai());
                System.out.println(thuVien.get(i).getNgayXB());

            }
        }
        if(cnt == 0) System.out.println("Không thấy sách");
    }
    private void xemDS(ArrayList<Sach> thuVien){
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
    private void chucNangAdmin(ArrayList<Sach> thuVien){
        System.out.println("Chức năng của admin: ");
        System.out.println("1. Thêm sách.");
        System.out.println("2. Xóa sách.");
        System.out.println("3. Cập nhật sách.");
        System.out.println("4. Tìm kiếm sách.");
        System.out.println("5. Xem danh sách sách.");
        System.out.println("6. Thoát tài khoản.");
        while(true){
            System.out.printf("Nhập chức năng: ");
            int chucNang = sc.nextInt();
            sc.nextLine();
            switch (chucNang){
                case 1:
                    themSach(thuVien);
                    break;
                case 2:
                    xoaSach(thuVien);
                    break;
                case 3:
                    capNhatSach(thuVien);
                    break;
                case 4:
                    timKiemSach(thuVien);
                    break;
                case 5:
                    xemDS(thuVien);
                    break;
                case 6:
                    return;
            }
        }
    }
}
