package customer.decorator;

import customer.Response;
import customer.Message;

public class ResponseToMessageCustomerAdapter implements Message {
    private Response response;

    public ResponseToMessageCustomerAdapter(Response response) {
        this.response = response;
    }

    @Override
    public void getMessage(String message) {
        var splitMessage = message.split("-");
        var marca = splitMessage[0];
        //response.setMensagem(message);
    }
}
