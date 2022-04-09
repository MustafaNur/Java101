import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner artikYil = new Scanner(System.in);
        short date;
        System.out.print("Yıl giriniz: ");
        date = artikYil.nextShort();
        System.out.print(date % 4 == 0 ? "Gridiğiniz yıl bir artık yıldır" : "Girdiğiniz yıl artık yıl değildir!");
    }
}
