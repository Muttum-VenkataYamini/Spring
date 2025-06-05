package org.MuttumVenkataYamini.DI;


public class ConstructorBasedDI {

    private Message message;

    private String messageFromDI;

    public ConstructorBasedDI(Message message){
        this.message = message; //constructor injection
        this.messageFromDI = message.getMessage();

    }

    public String getMessageFromDI(){
        return messageFromDI + ". From ConstructorBasedDI class!";
    }


}
