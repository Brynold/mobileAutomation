package enums;


public enum filePath {
    DEVICE_File(System.getProperty("user.dir")+"/src/main/resources/device.properties"),
    EMULATOR_FILE(System.getProperty("user.dir")+"/src/main/resources/startEmulator.bat");
    private String value;

    private filePath(String value) {
        this.value = value;
    }

    public String getData() {
        return value;
    }
}
