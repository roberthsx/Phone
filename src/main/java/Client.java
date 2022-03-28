import factory.PhoneFactory;
import models.Phone;

public class Client {
    public static void main(String[] args) {
        System.out.println("### Ordering an Simple iPhone");
        Phone iphone = PhoneFactory.OrderPhone(PhoneFactory.IPHONE,10);
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an Simple Samsung");
        Phone samsung = PhoneFactory.OrderPhone(PhoneFactory.SAMSUNG,1);
        System.out.println(samsung);
    }
}