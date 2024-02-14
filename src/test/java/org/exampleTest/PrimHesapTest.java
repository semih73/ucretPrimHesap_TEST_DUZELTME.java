package org.exampleTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PrimHesapTest {
    int sayi;
    int gunlukCalismaUcreti = 600;
    int primGunSayisi;
    int primGunlukUcret = 700;
    int toplamGelir;
    public int formul () {
        toplamGelir = (sayi * gunlukCalismaUcreti) + (primGunSayisi * primGunlukUcret);
        return toplamGelir;
    }
    private int testResult;
    @Test
    public void UcretPrimli() {
        sayi=26;
        primGunSayisi = sayi - 25;
        testResult=formul();
        assertEquals(testResult, 16300);
    }
    @Test
    public void UcretPrimsiz(){
        sayi=24;
        primGunSayisi=0;
        testResult=formul();
        assertEquals(testResult, 14400);
    }
}
