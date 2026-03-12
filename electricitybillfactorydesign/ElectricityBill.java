package electricitybillfactorydesign;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Connection Type (COMMERCIAL/GRUHAJYOTHI): ");
        String type = sc.nextLine();

        System.out.println("Enter Units Consumed: ");
        int units = sc.nextInt();

        ElectricityConnection connection = ConnectionModel.getConnectionType(type);

        if (connection != null) {
            int bill = connection.calculateBill(units);
            System.out.println("Total Bill: " + bill);
        } else {
            System.out.println("Invalid Connection Type");
        }

        sc.close();
    }
}