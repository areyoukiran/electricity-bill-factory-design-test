package electricitybillfactorydesign;

public class CommercialConnection implements ElectricityConnection {

    @Override
    public int calculateBill(int units) {

        int bill = 0;

        if (units >= 1 && units <= 100) {
            bill = units * 10;
        }

        return bill;
    }
}