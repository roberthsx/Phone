package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderMessage {
    private String Body;
    private String CC;
    private String Destination;
    private String Origin;

    public OrderMessage(){

    }
}