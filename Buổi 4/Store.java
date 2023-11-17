import java.util.ArrayList;
import java.util.Scanner;

public class Store{
    public static ArrayList<Book> listBook = new ArrayList<>();
    public static ArrayList<Notebook> listNotebook = new ArrayList<>();
    public static ArrayList<Pencil> listPencil = new ArrayList<>();
    public static ArrayList<Pen> listPen = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chào mừng đến với Tham's Store");
        while(true){
            Login login = new Login();
            login.Login();
        }

    }
}
