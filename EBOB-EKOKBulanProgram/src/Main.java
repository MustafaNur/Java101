import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, small;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n1 = input.nextInt();
        System.out.print("Enter a number: ");
        n2 = input.nextInt();
        // döngüde kullanmak için küçük olan sayıyı buluyoruz
        if (n1 > n2) {
            small = n2;
        } else {
            small = n1;
        }
        // Ebob bulma
        int i = small;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                break;
            }
            i--;
        }
        int ebob=i;
        System.out.println(i);

        // Ekok bulma
        int k=1;
        while (k<=(n1*n2)){
            if (k%n1==0 && k%n2==0){
                System.out.println(k);
                break;
            }
            k++;
        }


       /*
        int ekok =(n1*n2)/ebob;
        System.out.println(ekok);
        */

    }
}