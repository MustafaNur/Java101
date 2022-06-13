import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a=1;
        System.out.print("Dizinin boyutunu giriniz: ");
        int length = inp.nextInt();
        System.out.println("Dizinin boyutu: "+length);
        int [] list = new int[length];

        for (int i=0;i<length;i++){
            System.out.println(a+++". "+"Dizi elemanlarını giriniz: ");
            list[i] = inp.nextInt();

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
