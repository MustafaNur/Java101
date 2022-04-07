import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte month, day;
        boolean isError = false;
        String  burc = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = input.nextByte();

        System.out.print("doğduğunuz gün: ");
        day = input.nextByte();

        switch (month){
            case 1:
                if (day >= 1 && day <= 31){
                    if (day < 22){
                        burc = "oğlak";
                    }
                    else {
                        burc = "kova";
                    }
                }else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28){
                    if (day < 22){
                        burc = "kova";
                    }
                    else {
                        burc = "balık";
                    }
                }else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 30){
                    if (day < 20){
                        burc = "balık";
                    }
                    else {
                        burc = "koç";
                    }
                }else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if (isError){
            System.out.println("Hatalı giriş yaptınız tekrar deneyiniz...");
        }else{
            System.out.print("burcunuz: " + burc);
        }
    }
}
