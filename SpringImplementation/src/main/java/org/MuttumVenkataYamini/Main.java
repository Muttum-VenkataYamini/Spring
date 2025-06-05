package org.MuttumVenkataYamini;

import org.MuttumVenkataYamini.DI.*;
import org.MuttumVenkataYamini.IOCConfigurations.AnnotationBasedConfiguration;
import org.MuttumVenkataYamini.IOCConfigurations.JavabasedConfiguration;
import org.MuttumVenkataYamini.IOCConfigurations.MyBean;
import org.MuttumVenkataYamini.IOCConfigurations.XmlConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("-------------------- IOC - Inversion Of Control ------------------------------");
            // Load XML-based configuration
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            XmlConfiguration xmlConfiguration = context.getBean(XmlConfiguration.class); // XmlConfiguration is the bean id in applicationContext.xml but using .class file to access
            System.out.println(xmlConfiguration.getMessage());

            // Load Java-based configuration
            ApplicationContext context1 = new AnnotationConfigApplicationContext(JavabasedConfiguration.class);
            MyBean myBean = context1.getBean(MyBean.class);
            System.out.println(myBean.getMessage());

            // Load Annotation-based configuration
            ApplicationContext context2 = new AnnotationConfigApplicationContext(AnnotationBasedConfiguration.class);
            AnnotationBasedConfiguration annotationBasedConfiguration = context2.getBean(AnnotationBasedConfiguration.class); // AnnotationBasedConfiguration with Annotation @Component
            System.out.println(annotationBasedConfiguration.getMessage());
            System.out.println("IOC Completed successfully !!!!!!...");
            System.out.println();

            System.out.println("-------------------- Dependency Injection ------------------------------");

            // Load Constructor-based Dependency Injection
            // Assuming you have a bean defined in applicationContext.xml with id "ConstructorInjection"
            // and it has a constructor that takes a String argument.

            ApplicationContext contextConstructorDI = new ClassPathXmlApplicationContext("applicationContext.xml");
            ConstructorBasedDI constructorBasedDI = (ConstructorBasedDI) contextConstructorDI.getBean("ConstructorInjection"); // ConstructorBasedDI is the bean id in applicationContext.xml
            System.out.println(constructorBasedDI.getMessageFromDI());

            ApplicationContext contextSetterDI = new ClassPathXmlApplicationContext("applicationContext.xml");
            SetterBasedDI setterBasedDI = (SetterBasedDI) contextSetterDI.getBean("SetterInjection");// SetterBasedDI is the bean id in applicationContext.xml
            System.out.println(setterBasedDI.getMessageFromDI());

            ApplicationContext contextAnnotationDI = new AnnotationConfigApplicationContext(AppConfig.class);
            AnnotationBasedDI annotationBasedDI = contextAnnotationDI.getBean(AnnotationBasedDI.class); // AnnotationBasedDI with Annotation @Component
            System.out.println(annotationBasedDI.getMessageFromDI());

            ApplicationContext contextJavaBasedDI = new AnnotationConfigApplicationContext(JavaBasedDI.class);
            JavaBasedDI javaBasedDI = contextJavaBasedDI.getBean(JavaBasedDI.class); // JavaBasedDI with Annotation @Configuration
            System.out.println(javaBasedDI.getMessageText());


        } catch (Exception e) {
            System.out.println("An error occurred while loading the application context: ");
        }
    }
}