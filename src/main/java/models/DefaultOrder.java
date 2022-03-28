package models;

public class DefaultOrder implements Order {

    @Override
    public void Build() {

    }

    @Override
    public Double getPrice() {
        return 1000.0;
    }

    @Override
    public Integer getAmount() {
        return 100;
    }
}
