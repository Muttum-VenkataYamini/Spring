package org.MuttumVenkataYamini.DI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AnnotationBasedDI {

    @Autowired
    private AnnotationMessage annotationMessage;
    // Using @Autowired to inject the Message bean
    public String getMessageFromDI() {
        if (annotationMessage != null) {
            return annotationMessage.getMessage() + ". From AnnotationBasedDI class!";
        } else {
            return "Message not set!";
        }
    }
}
