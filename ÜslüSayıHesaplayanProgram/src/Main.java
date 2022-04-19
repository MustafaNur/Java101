import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ussu = new Scanner(System.in);
        int t,u;
        System.out.print("Üssü alınacak sayıyı girin: ");
        t = ussu.nextInt();
        System.out.print("üs olacak sayı: ");
        u = ussu.nextInt();
        int total = 1;
        //2^3 2*2*2
        for (int i = 1; i <= u; i++ ){
            total *= t;
        }
        System.out.print(total);
    }
}
