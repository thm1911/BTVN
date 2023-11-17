import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Customer {
    Scanner sc = new Scanner(System.in);
    private void Menu(){
        System.out.println("1. Sách");
        System.out.println("2. Vở ghi");
        System.out.println("3. Bút mực");
        System.out.println("4. Bút chì");
    }
    public void adminFunction(){
        System.out.println("Danh sách chức năng của admin: ");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Xóa sản phẩm");
        System.out.println("3. Sửa sản phẩm");
        System.out.println("4. Tìm kiếm sản phẩm ");
        System.out.println("5. Xem danh sách sản phẩm");
        System.out.println("6. Thoát tài khoản");
        while(true){
            System.out.print("Nhập chức năng: ");
            int function = Integer.valueOf(sc.nextLine());
            switch (function){
                case 1:
                    Add();
                    System.out.println("Đã thêm sản phẩm!");
                    break;
                case 2:
                    Delete();
                    System.out.println("Đã xóa sản phẩm!");
                    break;
                case 3:
                    Update();
                    System.out.println("Đã sửa sản phẩm!");
                    break;
                case 4:
                    Search();
                    break;
                case 5:
                    List();
                    break;
                default:
                    return;
            }

        }
    }
    public void Add(){
        System.out.println("Chọn loại sản phẩm muốn thêm: ");
        Menu();
        int x = sc.nextInt();
        sc.nextLine();
        switch (x){
            case 1:
                Book book = new Book();
                book.Add();
                Store.listBook.add(book);
                break;
            case 2:
                Notebook notebook= new Notebook();
                notebook.Add();
                Store.listNotebook.add(notebook);
                break;
            case 3:
                Pen pen = new Pen();
                pen.Add();
                Store.listPen.add(pen);
                break;
            case 4:
                Pencil pencil = new Pencil();
                pencil.Add();
                Store.listPencil.add(pencil);
                break;
        }
    }
    public void Delete(){
        System.out.println("Danh sách loại sản phẩm: ");
        Menu();
        System.out.print("Chọn loại sản phẩm muốn xóa: "); int x = Integer.valueOf(sc.nextLine());
        System.out.print("Nhập vị trí sản phẩm muốn xóa: "); int id = Integer.valueOf(sc.nextLine());
        switch (x){
            case 1:
                if(id > Store.listBook.size() ) System.out.println("Không tồn tại sản phẩm!");
                else{
                    Store.listBook.remove(id);
                }
                break;
            case 2:
                if(id > Store.listNotebook.size() ) System.out.println("Không tồn tại sản phẩm!");
                else{
                    Store.listNotebook.remove(id);
                }
                break;
            case 3:
                if(id > Store.listPen.size() ) System.out.println("Không tồn tại sản phẩm!");
                else{
                    Store.listPen.remove(id);
                }
                break;
            case 4:
                if(id > Store.listPencil.size() ) System.out.println("Không tồn tại sản phẩm!");
                else{
                    Store.listPencil.remove(id);
                }
        }
    }
    public void Update(){
        System.out.println("Danh sách loại sản phẩm: ");
        Menu();
        System.out.print("Chọn loại sản phẩm muốn sửa: "); int x = Integer.valueOf(sc.nextLine());
        System.out.print("Nhập vị trí sản phẩm muốn sửa: "); int id = Integer.valueOf(sc.nextLine());
        switch (x){
            case 1:
                if(id > Store.listBook.size() ) System.out.println("Không tồn tại sản phẩm!");
                else{
                    Store.listBook.get(id).Add();
                }
                break;
            case 2:
                if(id > Store.listNotebook.size() ) System.out.println("Không tồn tại sản phẩm!");
                else{
                    Store.listNotebook.get(id).Add();
                }
                break;
            case 3:
                if(id > Store.listPen.size() ) System.out.println("Không tồn tại sản phẩm!");
                else{
                    Store.listPen.get(id).Add();
                }
                break;
            case 4:
                if(id > Store.listPencil.size() ) System.out.println("Không tồn tại sản phẩm!");
                else{
                    Store.listPencil.get(id).Add();
                }
        }
    }
}
