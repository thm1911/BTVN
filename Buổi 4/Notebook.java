import static java.lang.Math.max;

public class Notebook extends Product{
    private String page, typeNoteBook, color, paperMaterials, size;
    public void setPage(String page) {
        this.page = page;
    }
    public String getPage() {
        return page;
    }
    public void setTypeNoteBook(String typeNoteBook) {
        this.typeNoteBook = typeNoteBook;
    }
    public String getTypeNoteBook() {
        return typeNoteBook;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setPaperMaterials(String paperMaterials) {
        this.paperMaterials = paperMaterials;
    }
    public String getPaperMaterials() {
        return paperMaterials;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public boolean compare(String x){
        if(super.Find(x) || page.contains(x) || typeNoteBook.contains(x) || color.contains(x) || paperMaterials.contains(x) || size.contains(x)) return true;
        else return false;
    }
    public void Add(){
        super.Add();
        System.out.print("Nhập số trang: "); page = sc.nextLine();
        System.out.print("Nhập tên loại vở: "); typeNoteBook = sc.nextLine();
        System.out.print("Nhập màu sắc bìa: "); color = sc.nextLine();
        System.out.print("Nhập chất liệu giấy: "); paperMaterials = sc.nextLine();
        System.out.print("Nhập kích thước: "); size = sc.nextLine();
        setPage(page);
        setTypeNoteBook(typeNoteBook);
        setColor(color);
        setPaperMaterials(paperMaterials);
        setSize(size);
    }
    public void Mode1(){
        super.Mode1();
        System.out.println("Trang: " + page);
        System.out.println("Loại vở: " + typeNoteBook);
        System.out.println("Màu sắc bìa: " + color);
        System.out.println("Chất liệu giấy: " + paperMaterials);
        System.out.println("Kích thước: " + size);
    }
//    public void Mode2(int len_Name, int len_Price,int len_Brand,int len_Bonus){
//        super.Mode2(len_Name,len_Price,len_Brand,len_Bonus);
//        len_Bonus = max(len_Bonus, ("- Số trang: " + getPage()).length());
//        len_Bonus = max(len_Bonus, ("- Loại vở: " + getTypeNoteBook()).length());
//        len_Bonus = max(len_Bonus, ("- Màu sắc bìa: " + getColor()).length());
//        len_Bonus = max(len_Bonus, ("- Chất liệu giấy: " + getPaperMaterials()).length());
//        len_Bonus = max(len_Bonus, ("- Kích thước: " + getSize()).length());
//    }
}
