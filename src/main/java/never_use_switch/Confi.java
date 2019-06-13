package never_use_switch;

import com.github.javafaker.Faker;
import com.github.javafaker.GameOfThrones;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableScheduling
@ComponentScan
public class Confi {
    @Bean
    public Random random() {
        return new Random();
    }

    @Bean
    public GameOfThrones gameOfThrones() {
        return new Faker().gameOfThrones();
    }

    @Bean
    public Map<String, Sender> map(List<Sender> senders) {
        return senders.stream().collect(toMap(Sender::getMyType, Function.identity()));
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Confi.class);
    }
}










