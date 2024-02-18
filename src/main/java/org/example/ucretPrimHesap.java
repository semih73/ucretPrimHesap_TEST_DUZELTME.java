package org.example;
import java.util.Scanner;
public class ucretPrimHesap {
    public static void main(String[] args) {
        int calisilanGun = UcretFormul.calisilanGun(); // calisilanGun metodunu çağır ve değeri sakla
        UcretFormul.ucretHesapla(calisilanGun); // ucretHesapla metodunu çağır ve calisilanGun değerini parametre olarak gönder
    }
}
