package factory;


import builder.FtpMessageBuilder;
import builder.HttpMessageBuilder;
import builder.MainMessageBuilder;
import builder.OrderMessageBuilder;
import director.OrderMessageDirector;
import infra.RequestOrder;
import infra.strategies.EmailSendOrder;
import infra.strategies.FtpSendOrder;
import infra.strategies.HttpSendOrder;
import models.*;
import observers.InboxOrder;

public class PhoneFactory {
    public static final String IPHONE = "IPHONE";
    public static final String SAMSUNG = "SAMSUNG";
    public static final String SONY = "SONY";
    public static final String MOTOROLA = "MOTOROLA";

    public static Phone OrderPhone(String type, int amount) {
        Phone device = null;
        switch (type) {
            case (IPHONE):
                var orderMessageIphone = getNotificationService(new FtpMessageBuilder());
                RequestOrder requestOrderIphone = new RequestOrder(orderMessageIphone);
                requestOrderIphone.SendOrder(new FtpSendOrder());
                AlertOrder alertOrder = new AlertOrder();
                alertOrder.add(new InboxOrder());
                System.out.println("a notification arrived");
                alertOrder.setStatus(true);
                device = new Iphone();
                break;
            case (SAMSUNG):
                var orderMessageSamsung = getNotificationService(new HttpMessageBuilder());
                RequestOrder requestOrderSamsung = new RequestOrder(orderMessageSamsung);
                requestOrderSamsung.SendOrder(new HttpSendOrder());
                device = new Samsung();
                break;
            case (SONY):
                var orderMessageSony = getNotificationService(new MainMessageBuilder());
                RequestOrder requestOrderSony = new RequestOrder(orderMessageSony);
                requestOrderSony.SendOrder(new EmailSendOrder());
                device = new Sony();
                break;
            case (MOTOROLA):
                var orderMessageMotorola = getNotificationService(new MainMessageBuilder());
                RequestOrder requestOrderMotorola = new RequestOrder(orderMessageMotorola);
                requestOrderMotorola.SendOrder(new EmailSendOrder());
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
