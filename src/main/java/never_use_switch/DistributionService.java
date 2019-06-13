package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class DistributionService {

    private Map<String, Sender> map;

    @Autowired
    public DistributionService(List<Sender> senders) {
        map = senders.stream().collect(toMap(Sender::getMyType, Function.identity()));
    }

    public void sendMessage(Message message) {
        String distributionType = message.getDistributionType();
        Sender sender = map.get(distributionType);
        if (sender == null) {
            throw new UnsupportedOperationException(distributionType + " not supported yet");
        }
        sender.send(message);

    }
}







