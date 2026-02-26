package activity7;

public class SmartThermostat extends SmartDevice {
    double temperature;

    public SmartThermostat(String deviceName) {
        super(deviceName);
        this.temperature = 20.0;
    }

    @Override
    public void displayStatus(double temp) {
        super.displayStatus();
        System.out.println("Temperature: " + temperature + "°C");
    }

    public void setTemperature(double temp) {
        if (temp > 30) {
            System.out.println("warning temperature over 30°");
        }
        this.temperature = temp;
    }
}
