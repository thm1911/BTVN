import java.util.Scanner;
import static java.lang.Math.max;
public class Customer {
    Scanner sc = new Scanner(System.in);
    public void customerFunction() {
        System.out.println("Danh sách chức năng của khách: ");
        System.out.println("1. Tìm kiếm sản phẩm ");
        System.out.println("2. Xem danh sách sản phẩm ");
        System.out.println("3. Thoát tài khoản");
        while (true) {
            System.out.print("Nhập chức năng: ");
            int function = Integer.valueOf(sc.nextLine());
            switch (function) {
                case 1:
                    Search();
                    break;
                case 2:
                    List();
                    break;
                default:
                    return;
            }
        }
    }

    public void Search() {
        System.out.print("Nhập từ khóa bạn muốn tìm: ");
        String key = sc.nextLine();
        System.out.println("Chọn chế độ xem danh sách sản phẩm tìm kiếm được: ");
        System.out.println("1. Chế độ danh sách");
        System.out.println("2. Chế độ bảng");
        int mode = Integer.valueOf(sc.nextLine());
        if (mode == 1) {
            System.out.println("Danh sách sản phẩm tìm kiếm được: ");
            for (int i = 0; i < Store.listBook.size(); i++) {
                if (Store.listBook.get(i).Find(key)){
                    Store.listBook.get(i).Mode1();
                    System.out.println("--------------------");
                }
            }
            for (int i = 0; i < Store.listNotebook.size(); i++) {
                if (Store.listNotebook.get(i).Find(key)){
                    Store.listNotebook.get(i).Mode1();
                    System.out.println("--------------------");
                }
            }

            for (int i = 0; i < Store.listPen.size(); i++) {
                if (Store.listPen.get(i).Find(key)){
                    Store.listPen.get(i).Mode1();
                    System.out.println("--------------------");
                }
            }
            for (int i = 0; i < Store.listPencil.size(); i++) {
                if (Store.listPencil.get(i).Find(key)){
                    Store.listPencil.get(i).Mode1();
                    System.out.println("--------------------");
                }
            }
        }
        else if (mode == 2) {
            int len_Name = "Tên sản phẩm".length(),
                    len_Price = "Giá bán".length(),
                    len_Brand = "Thương hiệu".length(),
                    len_Bonus = "Thông tin thêm".length();

            for (int i = 0; i < Store.listBook.size(); i++){
                len_Name = max(len_Name,Store.listBook.get(i).getName().length());
                len_Price = max(len_Price,Store.listBook.get(i).getPrice().length());
                len_Brand = max(len_Brand,Store.listBook.get(i).getBrand().length());
                len_Bonus = max(len_Bonus, ("- Thể loại: " + Store.listBook.get(i).getGenre()).length());
                len_Bonus = max(len_Bonus, ("- Tác giả: " + Store.listBook.get(i).getAuthor()).length());
                len_Bonus = max(len_Bonus, ("- Nhà xuất bản: " + Store.listBook.get(i).getPublisher()).length());
                len_Bonus = max(len_Bonus, ("- Năm xuất bản: " + Store.listBook.get(i).getPublishDate()).length());
                len_Bonus = max(len_Bonus, ("- Ngôn ngữ: " + Store.listBook.get(i).getLanguage()).length());
            }
            for (int i = 0; i < Store.listPen.size(); i++){
                len_Name = max(len_Name,Store.listPen.get(i).getName().length());
                len_Price = max(len_Price,Store.listPen.get(i).getPrice().length());
                len_Brand = max(len_Brand,Store.listPen.get(i).getBrand().length());
                len_Bonus = max(len_Bonus, ("- Màu sắc: " + Store.listPen.get(i).getColor()).length());
                len_Bonus = max(len_Bonus, ("- Chất liệu: " + Store.listPen.get(i).getMaterials()).length());
                len_Bonus = max(len_Bonus, ("- Loại mực: " + Store.listPen.get(i).getTypeInk()).length());
                len_Bonus = max(len_Bonus, ("- Độ mịn: " + Store.listPen.get(i).getSmooth()).length());
            }
            for (int i = 0; i < Store.listNotebook.size(); i++){
                len_Name = max(len_Name,Store.listNotebook.get(i).getName().length());
                len_Price = max(len_Price,Store.listNotebook.get(i).getPrice().length());
                len_Brand = max(len_Brand,Store.listNotebook.get(i).getBrand().length());
                len_Bonus = max(len_Bonus, ("- Số trang: " + Store.listNotebook.get(i).getPage()).length());
                len_Bonus = max(len_Bonus, ("- Loại vở: " + Store.listNotebook.get(i).getTypeNoteBook()).length());
                len_Bonus = max(len_Bonus, ("- Màu sấc bìa: " + Store.listNotebook.get(i).getColor()).length());
                len_Bonus = max(len_Bonus, ("- Chất liệu giấy: " + Store.listNotebook.get(i).getPaperMaterials()).length());
                len_Bonus = max(len_Bonus, ("- Kích thước: " + Store.listNotebook.get(i).getSize()).length());
            }
            for (int i = 0; i < Store.listPencil.size(); i++){
                len_Name = max(len_Name,Store.listPencil.get(i).getName().length());
                len_Price = max(len_Price,Store.listPencil.get(i).getPrice().length());
                len_Brand = max(len_Brand,Store.listPencil.get(i).getBrand().length());
                len_Bonus = max(len_Bonus, ("- Màu sắc: " + Store.listPencil.get(i).getColor()).length());
                len_Bonus = max(len_Bonus, ("- Chất liệu: " + Store.listPencil.get(i).getMaterials()).length());
                len_Bonus = max(len_Bonus, ("- Độ cứng: " + Store.listPencil.get(i).getHard()).length());
            }
            System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "%-" + len_Bonus + "s" , "Tên sản phẩm", "Giá bán", "Thương hiệu", "Thông tin thêm"));
            for (int i = 0; i < Store.listBook.size(); i++) {
                if (Store.listBook.get(i).Find(key)) {
                    System.out.print(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" +" | " , Store.listBook.get(i).getName(), Store.listBook.get(i).getPrice(), Store.listBook.get(i).getBrand()));
                    System.out.println(String.format("- Thể loại: " + "%-" + len_Bonus + "s" ,Store.listBook.get(i).getGenre()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Tác giả: %-" + len_Bonus + "s" , "", "", "", Store.listBook.get(i).getAuthor()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Nhà xuất bản: %-" + len_Bonus + "s" , "", "", "", Store.listBook.get(i).getPublisher()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Năm xuất bản: %-" + len_Bonus + "s" , "", "", "", Store.listBook.get(i).getPublishDate()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Ngôn ngữ: %-" + len_Bonus + "s" , "", "", "", Store.listBook.get(i).getLanguage()));
                }
            }
            for (int i = 0; i < Store.listNotebook.size(); i++) {
                if (Store.listNotebook.get(i).Find(key)) {
                    System.out.print(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | ", Store.listNotebook.get(i).getName(), Store.listNotebook.get(i).getPrice(), Store.listNotebook.get(i).getBrand()));
                    System.out.println(String.format("- Số trang: " + "%-" + len_Bonus + "s" ,Store.listNotebook.get(i).getPage()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Loại vở: %-" + len_Bonus + "s" , "", "", "", Store.listNotebook.get(i).getTypeNoteBook()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Màu sắc bìa: %-" + len_Bonus + "s", "", "", "", Store.listNotebook.get(i).getColor()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Chất liệu giấy: %-" + len_Bonus + "s" , "", "", "", Store.listNotebook.get(i).getPaperMaterials()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Kích thước: %-" + len_Bonus + "s" , "", "", "", Store.listNotebook.get(i).getSize()));
                }
            }
            for (int i = 0; i < Store.listPen.size(); i++) {
                if (Store.listPen.get(i).Find(key)) {
                    System.out.print(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | ", Store.listPen.get(i).getName(), Store.listPen.get(i).getPrice(), Store.listPen.get(i).getBrand()));
                    System.out.println(String.format("- Màu sắc: " + "%-" + len_Bonus + "s" ,Store.listPen.get(i).getColor()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Chất liệu: %-" + len_Bonus + "s" , "", "", "", Store.listPen.get(i).getMaterials()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Loại mực: %-" + len_Bonus + "s" , "", "", "", Store.listPen.get(i).getTypeInk()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Độ mịn: %-" + len_Bonus + "s" , "", "", "", Store.listPen.get(i).getSmooth()));
                }
            }
            for (int i = 0; i < Store.listPencil.size(); i++) {
                if (Store.listPencil.get(i).Find(key)) {
                    System.out.print(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | ", Store.listPencil.get(i).getName(), Store.listPencil.get(i).getPrice(), Store.listPencil.get(i).getBrand()));
                    System.out.println(String.format("- Màu sắc: " + "%-" + len_Bonus + "s" ,Store.listPencil.get(i).getColor()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Chất liệu: %-" + len_Bonus + "s" , "", "", "", Store.listPencil.get(i).getMaterials()));
                    System.out.println(String.format("%-" + len_Name + "s" + " | " + "%-" + len_Price + "s" + " | " + "%-" + len_Brand + "s" + " | " + "- Độ cứng: %-" + len_Bonus + "s", "", "", "", Store.listPencil.get(i).getHard()));
                }
            }
        }
    }

    public void List() {
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < Store.listBook.size(); i++){
            Store.listBook.get(i).Mode1();
            System.out.println("--------------------");
        }
        for (int i = 0; i < Store.listNotebook.size(); i++){
            Store.listNotebook.get(i).Mode1();
            System.out.println("--------------------");
        }
        for (int i = 0; i < Store.listPen.size(); i++){
            Store.listPen.get(i).Mode1();
            System.out.println("--------------------");
        }
        for (int i = 0; i < Store.listPencil.size(); i++){
            Store.listPencil.get(i).Mode1();
            System.out.println("--------------------");
        }
    }
}

