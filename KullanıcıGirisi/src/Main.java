
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        String userName, password;

        System.out.print("Kullanıcı adı: ");
        userName = giris.nextLine();
        System.out.print("Şifre: ");
        password = giris.nextLine();

        if (userName.equals("java") && password.equals("java101")){
            System.out.print("Giriş başarılı");
        }else {
            System.out.print("Bilgileriniz yanlış !!");
        }
    }
}
