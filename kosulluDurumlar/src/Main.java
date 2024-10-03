import java.util.Scanner;

//Koşullu durumlar kullanılarak yapılan beden kitle indeksi hesaplama
/*
Beden Kitle İndeksi: Kilo / Boy(m) * Boy(m)

BKİ 18.5'un altındaysa --------> Zayıf

BKİ 18.5 ile 25 arasındaysa -------->Normal

BKİ 25 ile 30 arasındaysa --------> Fazla Kilolu

BKİ 30'un üstündeyse --------> Obez

 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuz: ");
        int kilo = scanner.nextInt();

        System.out.println("Boy (Örnek: 1,72): ");
        double boy = scanner.nextDouble();

        double bki = (kilo / (boy * boy));

        if(bki < 18.5){
            System.out.println("Zayıf");
        }
        else if (bki >= 18.5 && bki < 25){
            System.out.println("Normal");
        }
        else if(bki >= 25 && bki < 30){
            System.out.println("Fazla kilolu");
        }
        else{
            System.out.println("Obez");
        }

    }
}