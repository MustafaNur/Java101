import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        k = inp.nextInt();
        System.out.print("Çift olan sayılar");
        for (int i = 1; i <= k; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.print("3'e ve 4'e tam bölünen sayılar");
        int j = 0;
        while (j <= k) {
            if (j % 3 == 0 && j % 4 == 0 ){
                System.out.println(j);
            }
            j++;
        }

    }
}
