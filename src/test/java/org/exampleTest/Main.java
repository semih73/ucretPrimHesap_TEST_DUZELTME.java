package org.exampleTest;
import org.testng.annotations.Test;
//import org.testng.annotations.TestNGTest;
public class Main {
    public static void main(String[] args) {
        org.testng.TestNG.main(new String[]{"-d", "target/classes", "org.exampleTest.PrimHesapTest"});
    }
}
