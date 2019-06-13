package never_use_switch;

import org.springframework.stereotype.Component;

import static never_use_switch.DistribConst.SMS;
import static never_use_switch.DistribConst.WHATS_APP;

/**
 * @author Evgeny Borisov
 */
@Component(WHATS_APP)
public class WhatsappSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println("whatsapp was sent "+message.getContent());
    }
}
