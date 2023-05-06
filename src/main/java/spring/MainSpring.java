package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.config.SpringConfig;

public class MainSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Playground playground = context.getBean("playground", Playground.class);
//        playground.power();
//        System.out.println(playground.play());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Playground playground = context.getBean("playground", Playground.class);
        playground.power();
        System.out.println(playground.play());
    }
}
