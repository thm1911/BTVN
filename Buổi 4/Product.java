import java.util.Scanner;
import static java.lang.Math.max;

public class Product{
    Scanner sc = new Scanner(System.in);
    private String name, price,brand;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public String getPrice() {
        return price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public boolean Find(String x){
        if(name.contains(x) || price.contains(x) || brand.contains(x)) return true;
        else return false;
    }
    public void Add(){
        System.out.print("Nhập tên sản phẩm: "); name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: "); price = sc.nextLine();
        System.out.print("Nhập tên thương hiệu: "); brand = sc.nextLine();
        setName(name);
        setPrice(price);
        setBrand(brand);
    }
    public void Mode1(){
        System.out.println("Tên: " + getName());
        System.out.println("Giá: " + getPrice());
        System.out.println("Thương hiệu: " + getBrand());
    }
//    public void Mode2(int len_Name, int len_Price, int len_Brand,int len_Bonus){
//        len_Name = max(len_Name,getName().length());
//        len_Price = max(len_Price,getPrice().length());
//        len_Brand = max(len_Brand,getBrand().length());
//    }
}
