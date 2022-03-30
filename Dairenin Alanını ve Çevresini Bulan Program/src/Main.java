import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int r;
    double pi = 3.14;
    double circleSlice, centerAngle;
    Scanner inp = new Scanner(System.in);
    System.out.print("Dairenin yarıçapını giriniz : ");
    r = inp.nextInt();
    System.out.print("Merkez açısını giriniz: ");//(𝜋 * (r*r) * 𝛼) / 360
    centerAngle = inp.nextDouble();
    double alan = pi * r * r;
    double cevre = 2 * pi * r;
    circleSlice = (pi * (r * r) * centerAngle) / 360;
    System.out.println("Dairenin alanı: " + alan);
    System.out.println("Dairenin çevresi: " + cevre);
    System.out.print("Daire dilimin alanı: " + circleSlice);
    }
}
