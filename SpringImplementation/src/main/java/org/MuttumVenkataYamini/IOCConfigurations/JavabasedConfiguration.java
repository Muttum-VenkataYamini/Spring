package org.MuttumVenkataYamini.IOCConfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavabasedConfiguration {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
