package il.cshaifasweng.OCSFMediatorExample.client;

import il.cshaifasweng.OCSFMediatorExample.entities.Message;

public class MessageEvent {
    private Message message;
    private String ClientId;

    public String getClientId() {
        return ClientId;
    }
    public void setClientId(String clientId) {
        ClientId = clientId;
    }
    public Message getMessage() {
        return message;
    }

    public MessageEvent(Message message) {
        this.message = message;
    }
}
