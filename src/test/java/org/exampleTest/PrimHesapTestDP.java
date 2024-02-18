package org.exampleTest;

import org.example.UcretFormul;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PrimHesapTestDP {

    @Test(groups = "toplamgelir", dataProvider = "primHakki")
    public void primli(int sayi, int gunlukCalismaUcreti, int primGunlukUcret) {
        int testResultDP = UcretFormul.ucretHesapla(sayi);
        assertEquals(testResultDP, 16300);
    }

    @DataProvider(name = "primHakki")
    public Object[][] primHakki() {
        return new Object[][]{
                {26, 600, 700}
        };
    }
    @Test(groups = "toplamgelir", dataProvider = "primHakki2")
    public void primsiz(int sayi, int gunlukCalismaUcreti, int primGunlukUcret) {

        int testResultDP = UcretFormul.ucretHesapla(sayi);
        assertEquals(testResultDP, 14400);
    }
    @DataProvider(name = "primHakki2")
    public Object[][] primHakki2() {
        return new Object[][]{
                {24, 600, 700}
        };
    }
}


