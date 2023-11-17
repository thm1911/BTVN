import static java.lang.Math.getExponent;
import static java.lang.Math.max;

public class Pens extends Product{
    private String color, materials;
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setMaterials(String materials) {
        this.materials = materials;
    }
    public String getMaterials() {
        return materials;
    }
    public boolean Find(String x){
        if(super.Find(x) || color.contains(x) || materials.contains(x)) return true;
        else return false;
    }
    public void Add(){
        super.Add();
        System.out.print("Nhập màu sắc: "); color = sc.nextLine();
        System.out.print("Nhập chất liệu: "); materials = sc.nextLine();
        setColor(color);
        setMaterials(materials);
    }
    public void Mode1(){
        super.Mode1();
        System.out.println("Màu sắc: " + color);
        System.out.println("Chất liệu: " + materials);
    }
//    public void Mode2(int len_Name, int len_Price,int len_Brand,int len_Bonus){
//        super.Mode2(len_Name,len_Price,len_Brand,len_Bonus);
//        len_Bonus = max(len_Bonus, ("- Màu sắc: " + getColor()).length());
//        len_Bonus = max(len_Bonus, ("- Chất liệu: " + getMaterials()).length());
//    }
}
