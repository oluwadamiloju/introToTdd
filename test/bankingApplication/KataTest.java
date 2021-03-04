package bankingApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    private Kata testDriller;

    @BeforeEach
    void startAllTestsWithThis(){
        testDriller = new Kata();
    }

    @Test
    void purchaseOneUnitOfTestDrillerTest(){
        assertEquals(1500,testDriller.calculatePriceFor(1));
    }

    @Test
    void purchaseFourUnitsOfTestDrillerTest(){
        assertEquals(6000,testDriller.calculatePriceFor(4));
    }

    @Test
    void purchaseFiveToNineUnitsOfTestDrillerTest(){
        assertEquals(1400*5,testDriller.calculatePriceFor(5));
        assertEquals(1400*9,testDriller.calculatePriceFor(9));
    }

    @Test
    void purchaseTenToTwentyNineUnitsOfTestDrillerTest(){
        assertEquals(1200*10,testDriller.calculatePriceFor(10));
        assertEquals(1200*29,testDriller.calculatePriceFor(29));
    }

    @Test
    void purchaseThirtyToFortyNineUnitsOfTestDrillerTest(){
        assertEquals(1100*30,testDriller.calculatePriceFor(30));
        assertEquals(1100*49,testDriller.calculatePriceFor(49));
    }

    @Test
    void purchaseFiftyToNinetyNineUnitsOfTestDrillerTest(){
        assertEquals(1000*50,testDriller.calculatePriceFor(50));
        assertEquals(1000*99,testDriller.calculatePriceFor(99));
    }

    @Test
    void purchaseHundredToHundredAndNinetyNineUnitsOfTestDrillerTest(){
        assertEquals(900*100,testDriller.calculatePriceFor(100));
        assertEquals(900*199,testDriller.calculatePriceFor(199));
    }

    @Test
    void purchaseMoreThanTwoHundredUnitsOfTestDrillerTest(){
        assertEquals(800*2500,testDriller.calculatePriceFor(2500));
    }

    @Test
    void cannotPurchaseNegativeUnitsIfTestDrillerTest(){
        assertEquals(0,testDriller.calculatePriceFor(-7388));
    }
}
