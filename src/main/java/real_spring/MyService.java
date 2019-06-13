package real_spring;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */

@ToString
@Lazy
public class MyService {
    private String string;


    public MyService(String string) {
        this.string = string;
    }

    public MyService(int x) {
    }
}


