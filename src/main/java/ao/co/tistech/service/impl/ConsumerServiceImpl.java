package ao.co.tistech.service.impl;

import ao.co.tistech.dto.Message;
import ao.co.tistech.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(Message message) {
        System.out.println(message.getText());
    }
}
