package org.MuttumVenkataYamini.DI;

import org.springframework.stereotype.Component;

@Component
public class AnnotationMessage {

    public String getMessage() {
        return "Hello from AnnotationMessage class!";
    }
}
