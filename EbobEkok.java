import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı Giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı Giriniz: ");
        int n2 = input.nextInt();
        int kucuksayi;
        int buyuksayi;
        int i =1;
        int ebob = 1;
        if (n1>n2){
            kucuksayi = n2;
            buyuksayi = n1;

        } else {
            kucuksayi = n1;
            buyuksayi = n2;
        }
        while (i<=kucuksayi){
            if (kucuksayi%i==0 && buyuksayi%i==0){
                ebob = i;
            }
            i++;
        }
        System.out.println(ebob);
        int ekok = (buyuksayi*kucuksayi)/ebob;
        System.out.println(ekok);

    }
}
