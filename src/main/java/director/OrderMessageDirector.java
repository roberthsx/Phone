package director;

import builder.OrderMessageBuilder;
import models.OrderMessage;

public class OrderMessageDirector {
    private OrderMessageBuilder builder;

    public OrderMessageDirector(OrderMessageBuilder builder) {
        this.builder = builder;
    }

    public void constructMessage() {
        builder.buildBodyMessage();
        builder.buildDestinationMessage();
        builder.buildOriginMessage();

    }

    public OrderMessage getOrderMessage() {
        return builder.getOrderMessage();
    }
}
