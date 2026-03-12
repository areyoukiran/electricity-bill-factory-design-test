package electricitybillfactorydesign;

public class GruhaJyothiConnection implements ElectricityConnection {

    @Override
    public int calculateBill(int units) {

        int bill = 0;

        if (units >= 1 && units <= 100) {
            bill = 0;
        }
        else if (units >= 101 && units <= 200) {
            bill = units * 5;
        }
        else if (units >= 201 && units <= 250) {
            bill = units * 20;
        }

        return bill;
    }
}