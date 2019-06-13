package real_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class Service2 {

    @Autowired
    private ApplicationContext context;

    public void dos(){
        if (true) {
            MyService myService = context.getBean(MyService.class);
        }
    }
}
