package never_use_switch;

import org.springframework.stereotype.Service;

import static never_use_switch.DistribConst.SMS;
import static never_use_switch.DistribConst.WHATS_APP;

/**
 * @author Evgeny Borisov
 */
@Service
public class DistributionService {


    public void sendMessage(Message message) {
        String distributionType = message.getDistributionType();
        switch (distributionType) {
            case SMS:
                //20 lines of code
                System.out.println("sms was send: " + message.getContent());
                break;
            case WHATS_APP:
                //25 lines of code
                System.out.println("whatsapp was send: " + message.getContent());
        }
    }
}




