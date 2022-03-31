package customer;

public class MessageCustomer {
    private Message message;

    public void convertMessage(String response) {
        if(response == null) {
            System.out.println("Connect a HDMI cable first");
        } else {
            message.getMessage(response);
        }
    }
}
