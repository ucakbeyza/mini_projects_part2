import java.util.Scanner;

public class switchCaseHesapMakinesi {
    public static void main(String[] args){
        //Switch Case kullanarak 4 işlem yapan bir hesap makinesi tasarlama
        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");

        String islemler = "1. Toplama İşlemi\n"
                            +"2. Çıkarma İşlemi\n"
                            +"3. Çarpma İşlemi\n"
                            +"4. Bölme İşlemi";

        System.out.println(islemler);

        System.out.println("******************************");

        System.out.println("İşlem Seçiniz:");

        String islem = scanner.nextLine();
        int a;
        int b;
        switch(islem){
            case "1":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Toplam : " + (a + b));
                break;

            case "2":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Fark : " + (a - b));
                break;

            case "3":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Çarpım : " + (a * b));
                break;

            case "4":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Bölüm : " + ((double)a / b));
                break;

            default:
                System.out.println("Geçersiz İşlem");
        }


    }
}
