package org.example;

import java.util.Scanner;

public class UcretFormul {
        public static int calisilanGun() {
            Scanner gunSayisi = new Scanner(System.in);
            System.out.println("Gün sayisini girin: ");
            int sayi = gunSayisi.nextInt();
            System.out.println("Çalışılan gün sayısı: " + sayi);
            //gunSayisi.close();
            return sayi;
        }

        public static int ucretHesapla(int sayi) {
            //int sayi = calisilanGun(); // calisilanGun metodunu çağırarak sayi değerini al
            int gunlukCalismaUcreti = 600;
            int primGunlukUcret = 700;

            int toplamGelir = 0;
            if (sayi <= 25) {
                int primGunSayisi = 0;
                System.out.println("Prim hakkınız yok.");
                toplamGelir = sayi * gunlukCalismaUcreti;
                System.out.println("Gunluk calisma ucreti: " + gunlukCalismaUcreti);
                System.out.println("Gunluk prim ucreti: " + primGunlukUcret);
                System.out.println("Prim gun sayisi: " + primGunSayisi);
                System.out.println("Toplam gelir: " + toplamGelir);
            } else {
                int primGunSayisi = sayi - 25;
                System.out.println("Prim hakkınız var.");
                toplamGelir = (sayi * gunlukCalismaUcreti) + (primGunSayisi * primGunlukUcret);
                System.out.println("Gunluk calisma ucreti: " + gunlukCalismaUcreti);
                System.out.println("Gunluk prim ucreti: " + primGunlukUcret);
                System.out.println("Prim gun sayisi: " + primGunSayisi);
                System.out.println("Toplam gelir: " + toplamGelir);
            }
            return toplamGelir; // toplamGelir değerini döndür
        }
}
