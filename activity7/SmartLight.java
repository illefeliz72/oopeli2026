package activity7;

public class SmartLight extends SmartDevice {
    int brightness;

    public SmartLight(String deviceName) {
        super(deviceName);
        this.brightness = 0;
    }
    @Override
    public void displayStatus() {
        super.displayStatus(brightness);
        System.out.println("Brightness: " + brightness + "%");
    }
    public void setBrightness(int level){
        if (isOn) {
            this.brightness = level;
        } else {
            System.out.println("action failed due to " + deviceName + " is OFF.");
        }
        
    }
}
