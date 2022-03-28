package factory;


import builder.FtpMessageBuilder;
import builder.OrderMessageBuilder;
import director.OrderMessageDirector;
import models.*;

public class PhoneFactory {
    public static final String IPHONE = "IPHONE";
    public static final String SAMSUNG = "SAMSUNG";
    public static final String SONY = "SONY";
    public static final String MOTOROLA = "MOTOROLA";

    public static Phone OrderPhone(String type, int amount) {
        Phone device = null;
        switch (type) {
            case (IPHONE):
                var orderMessage = getNotificationService(new FtpMessageBuilder());
                device = new Iphone();
                break;
            case (SAMSUNG):
                device = new Samsung();
                break;
            case (SONY):
                device = new Sony();
                break;
            case (MOTOROLA):
                device = new Motorola();
                break;
        }
        if(device != null){
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }
        return device;
    }

    private static OrderMessage getNotificationService(OrderMessageBuilder builder){
        OrderMessageDirector director = new OrderMessageDirector(builder);
         director.constructMessage();
        return director.getOrderMessage();
    }
}
