package bankingApplication;

public class Kata {
    public int calculatePriceFor(int testDrillerQuantity) {
        int unitPrice = 0;
        if (testDrillerQuantity >= 1 && testDrillerQuantity <= 4) unitPrice = 1500;
        if (testDrillerQuantity >= 5 && testDrillerQuantity < 10) unitPrice = 1400;
        if (testDrillerQuantity >= 10 && testDrillerQuantity <= 29) unitPrice = 1200;
        if (testDrillerQuantity >= 30 && testDrillerQuantity <= 49) unitPrice = 1100;
        if (testDrillerQuantity >= 50 && testDrillerQuantity <= 99) unitPrice = 1000;
        if (testDrillerQuantity >= 100 && testDrillerQuantity <= 199) unitPrice = 900;
        if (testDrillerQuantity >= 200) unitPrice = 800;

        return unitPrice * testDrillerQuantity;
    }
}


