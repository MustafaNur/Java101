
public class Main {
    public static void main(String[] args) {

        byte deger = 100, kontrol = 0;

        for(int i=2; i<=deger;i++){

            for(int j=2;j<i;j++){

                if(i%j == 0){
                    kontrol = 1;
                }
            }

            if(kontrol == 0){
                System.out.println(i);
            }else{
                kontrol = 0;
            }

        }
}
}
