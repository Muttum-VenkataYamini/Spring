package org.MuttumVenkataYamini.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedDI {

    @Bean
    public Message getMessageObj() {
        System.out.println("Creating Message bean in JavaBasedDI configuration");
        return new Message();
    }

    public String getMessageText() {
        return getMessageObj().getMessage()+" From JavaBasedDI class!";
    }





}
