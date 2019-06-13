package real_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class Conf {

    @Bean
    public MyService myService(){
        MyService myService = new MyService(str());
        return myService;
    }


    @Bean
    public String str(){
        return "java";
    }



}
