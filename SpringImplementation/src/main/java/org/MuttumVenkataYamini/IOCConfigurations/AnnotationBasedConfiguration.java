package org.MuttumVenkataYamini.IOCConfigurations;

import org.springframework.stereotype.Component;
/***
 *  ***/

@Component
public class AnnotationBasedConfiguration {

    public String getMessage() {
        return "response from AnnotationBasedConfiguration!";
    }
}
