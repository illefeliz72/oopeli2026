package activity7;

public class SmartLight extends SmartDevice {

    private int brightness;

    public SmartLight(String deviceName) {
        super(deviceName);
        brightness = 0;
    }

    public void setBrightness(int level) {
        if (isOn) {
            if (level >= 0 && level <= 100) {
                brightness = level;
            }
        } else {
            System.out.println("Cannot change brightness. Light is OFF.");
        }
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Brightness: " + brightness);
        System.out.println();
    }
}