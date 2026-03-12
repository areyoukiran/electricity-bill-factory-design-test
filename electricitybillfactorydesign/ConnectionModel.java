package electricitybillfactorydesign;

public class ConnectionModel {

    public static ElectricityConnection getConnectionType(String type) {

        if (type.equalsIgnoreCase("COMMERCIAL")) {
            return new CommercialConnection();
        }
        else if (type.equalsIgnoreCase("GRUHAJYOTHI")) {
            return new GruhaJyothiConnection();
        }

        return null;
    }
}
