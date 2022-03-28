package infra;

import infra.strategies.SendOrderStrategy;
import models.OrderMessage;

public class RequestOrder {
    private OrderMessage orderMessage;
    public RequestOrder(OrderMessage orderMessage){
        this.orderMessage=orderMessage;
    }

    public String SendOrder(SendOrderStrategy sendOrderStrategy){
        return sendOrderStrategy.SendOrder();
    }
}