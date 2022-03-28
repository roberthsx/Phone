package models;

public class Iphone extends Phone {
    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.1in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 6Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
