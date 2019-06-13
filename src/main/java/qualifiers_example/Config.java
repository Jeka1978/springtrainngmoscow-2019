package qualifiers_example;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableScheduling
@ComponentScan
public class Config {



    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
