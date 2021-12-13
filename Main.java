
package idmanprogramı;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
            
    Scanner klavye = new Scanner(System.in);

    System.out.println("İdman programına hoşgeldiniz...");

    String idmanlar = "Geçerli hareketler\n "
                      + "Burpee\n "
                      + "Pushup\n "
                      + "Situp\n "
                      + "Squat ";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun...");
        
        System.out.println("Burpee sayısını girin: ");
        int burpee = klavye.nextInt();
        System.out.println("Pushup sayısını girin: ");
        int pushup = klavye.nextInt();
        System.out.println("Situp sayısını girin: ");
        int situp = klavye.nextInt();
        System.out.println("Squat sayısını girin: ");
        int squat = klavye.nextInt();
        
        klavye.nextLine();
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız başlatılıyor....");
        
        while(idman.idmanBittiMi() == false) {
            
            System.out.println("Hareket Türü(Burpee,Pushup,Situp,Squat): ");
            String tur = klavye.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız ? ");
            int sayi = klavye.nextInt();
            klavye.nextLine();
            idman.hareketYap(tur, sayi);
            
        }

        System.out.println("İdmanı başarıyla tamamladın...");
}
}