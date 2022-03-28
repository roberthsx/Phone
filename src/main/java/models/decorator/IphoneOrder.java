package models.decorator;

import models.Order;

public class IphoneOrder extends OrderDecorator{

    public IphoneOrder(Order order) {
        super(order);
    }

    @Override
    public void Build() {
        order.Build();
    }

    @Override
    public Double getPrice() {
        if(order.getAmount()>=100){
            var discount = (order.getPrice() * 10)/100;
            return (order.getPrice() - discount);
        }

        return order.getPrice();
    }

    @Override
    public Integer getAmount() {
        return order.getAmount();
    }
}