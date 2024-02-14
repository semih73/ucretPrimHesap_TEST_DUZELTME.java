package org.example;
import java.util.Scanner;
public class ucretPrimHesap {
    public static void main(String[] args) {
        int gunlukCalismaUcreti = 600;
        int primGunlukUcret = 700;
        //int primGunSayisi =0;
        int toplamGelir = 0;
        Scanner gunSayisi = new Scanner(System.in);
        System.out.println("Gün sayisini girin: ");
        int sayi = gunSayisi.nextInt();
        System.out.println("Çalışılan gün sayısı: " + sayi);
        if (sayi <= 25) {
            int primGunSayisi =0;
            System.out.println("Prim hakkınız yok.");
            toplamGelir = sayi * gunlukCalismaUcreti;
            System.out.println("Gunluk calisma ucreti: " + gunlukCalismaUcreti);
            System.out.println("Gunluk prim ucreti: " + primGunlukUcret);
            System.out.println("Prim gun sayisi: " + primGunSayisi);
            System.out.println("Toplam gelir: " + toplamGelir);
        }
        else {
            int primGunSayisi = sayi - 25;
            System.out.println("Prim hakkınız var.");
            toplamGelir = sayi * gunlukCalismaUcreti + primGunSayisi * primGunlukUcret;
            System.out.println("Gunluk calisma ucreti: " + gunlukCalismaUcreti);
            System.out.println("Gunluk prim ucreti: " + primGunlukUcret);
            System.out.println("Prim gun sayisi: " + primGunSayisi);
            System.out.println("Toplam gelir: " + toplamGelir);
        }
        gunSayisi.close();
    }
}
