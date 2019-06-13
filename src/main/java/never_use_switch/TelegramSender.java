package never_use_switch;

import org.springframework.stereotype.Component;

import static never_use_switch.DistribConst.SMS;
import static never_use_switch.DistribConst.TELEGRAM;

/**
 * @author Evgeny Borisov
 */
@Component(SMS)
public class TelegramSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println("telegram was sent");
    }
}
