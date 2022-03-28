package models;

public class Samsung extends Phone {
    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.1in Screen");
        System.out.println("\t- Qualcomm Snapdragon 888");
        System.out.println("\t- 8Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}