package org.exampleTest;

import org.example.UcretFormul;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PrimHesapTest {

    private int testResult;

    @Test
    public void UcretPrimli() {
        int sayi = 26;
        testResult = UcretFormul.ucretHesapla(sayi);
        assertEquals(testResult, 16300);
    }

    @Test
    public void UcretPrimsiz(){
        int sayi2 = 24;
        testResult = UcretFormul.ucretHesapla(sayi2);
        assertEquals(testResult, 14400);
    }
}


