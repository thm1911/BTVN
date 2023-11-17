import java.util.Scanner;

import static java.lang.Math.max;

public class Pencil extends Pens{
    private String hard;
    public void setHard(String hard) {
        this.hard = hard;
    }
    public String getHard() {
        return hard;
    }
    public boolean Find(String x){
        if(super.Find(x) || hard.contains(x)) return true;
        else return false;
    }
    public void Add(){
        super.Add();
        System.out.print("Nhập độ cứng: "); hard = sc.nextLine();
        setHard(hard);
    }
    public void Mode1(){
        super.Mode1();
        System.out.println("Độ cứng: " + hard);
    }
//    public void Mode2(int len_Name, int len_Price,int len_Brand,int len_Bonus){
//        super.Mode2(len_Name,len_Price,len_Brand,len_Bonus);
//        len_Bonus = max(len_Bonus, ("- Độ cứng: " + getHard()).length());
//    }
}