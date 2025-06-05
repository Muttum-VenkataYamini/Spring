package org.MuttumVenkataYamini.DI;

public class SetterBasedDI {
    private Message message;
    public void setMessage(Message message){
        this.message = message;
    }

    public String getMessageFromDI(){
        if (message != null) {
            return message.getMessage() + ". From SetterBasedDI class!";
        } else {
            return "Message not set!";
        }
    }

}
