import java.util.Scanner;
public class Login {
    Scanner sc = new Scanner(System.in);
    private String userName, passWord;
    public String getUserName() {
        return userName;
    }
    public String getPassWord() {
        return passWord;
    }

    public void Login(){
        System.out.print("Nhập tên tài khoản: ");
        userName = sc.nextLine();
        if(getUserName().equals("admin")){
            System.out.print("Nhập mật khẩu: ");
            passWord = sc.nextLine();
            if(getPassWord().equals("admin")){
                System.out.println("Đăng nhập thành công!");
                Admin admin = new Admin();
                admin.adminFunction();
            }
            else System.out.println("Tài khoản không hợp lệ!");
        }
        else if(getUserName().equals("khach")){
            System.out.println("Đăng nhập thành công!");
            Customer customer = new Customer();
            customer.customerFunction();
        }
        else System.out.println("Tài khoản không hợp lệ!");
    }
}
