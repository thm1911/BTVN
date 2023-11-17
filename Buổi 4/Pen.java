import java.util.Scanner;

import static java.lang.Math.max;

public class Pen extends Pens{
    private String typeInk, smooth;
    public void setTypeInk(String typeInk) {
        this.typeInk = typeInk;
    }
    public String getTypeInk() {
        return typeInk;
    }
    public void setSmooth(String smooth) {
        this.smooth = smooth;
    }
    public String getSmooth() {
        return smooth;
    }
    public boolean Find(String x){
        if(super.Find(x) || typeInk.contains(x) || smooth.contains(x)) return true;
        else return false;
    }
    public void Add(){
        super.Add();
        System.out.print("Nhập loại mực: "); typeInk = sc.nextLine();
        System.out.print("Nhập độ mịn: "); smooth = sc.nextLine();
        setTypeInk(typeInk);
        setSmooth(smooth);
    }
    public void Mode1(){
        super.Mode1();
        System.out.println("Loại mực: " +  typeInk);
        System.out.println("Độ mịn: " + smooth);
    }
//    public void Mode2(int len_Name, int len_Price,int len_Brand,int len_Bonus){
//        super.Mode2(len_Name,len_Price,len_Brand,len_Bonus);
//        len_Bonus = max(len_Bonus, ("- Loại mực: " + getTypeInk()).length());
//        len_Bonus = max(len_Bonus, ("- Độ mịn: " + getSmooth()).length());
//    }
}
