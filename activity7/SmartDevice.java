package activity7;

public class SmartDevice {
    protected String deviceName;
    public boolean isOn;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void togglePower() {
        this.isOn = true;
    }

    public void displayStatus() {
        String status;
        if (isOn) {
            status = "ON";
        } else {
            status = "OFF";
        }
        System.out.printf("""
                DEVICE NAME: %s
                STATUS: %s
                """, deviceName, status);
    }

    public void displayStatus(double temp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStatus'");
    }
}