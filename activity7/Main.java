package activity7;

public class Main {

    public static void main(String[] args) {

        SmartLight light = new SmartLight("Living Room Light");

        light.setBrightness(80); 

        light.togglePower(); 
        light.setBrightness(80);
        light.displayStatus();

        
        SmartThermostat thermostat = new SmartThermostat("Main Thermostat");

        thermostat.togglePower();
        thermostat.setTemperature(32);
        thermostat.displayStatus();
    }
}