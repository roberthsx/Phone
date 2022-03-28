package builder;

import models.OrderMessage;

public abstract class OrderMessageBuilder {
    protected OrderMessage orderMessage;

    public OrderMessageBuilder() {
        orderMessage = new OrderMessage();
    }

    public OrderMessage getOrderMessage() {
        return orderMessage;
    }

    public abstract void buildBodyMessage();
    public abstract void buildDestinationMessage();
    public abstract void buildOriginMessage();
}
