import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row,column;
        System.out.println("Mayın Tarlası");
        System.out.println("Oynamak istediğiniz tahta boyutu");
        //System.out.print("Satır sayısı");
        //row = scan.nextByte();
        //System.out.print("Sütun sayısı");
        //column = scan.nextByte();

        MineSweeper mayin = new MineSweeper(4,4);
        mayin.run();
    }
}
