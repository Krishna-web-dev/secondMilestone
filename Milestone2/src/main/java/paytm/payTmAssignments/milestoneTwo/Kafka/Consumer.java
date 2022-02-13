package paytm.payTmAssignments.milestoneTwo.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	Logger logger = LoggerFactory.getLogger(Consumer.class);

	@KafkaListener(topics="mytopic", groupId="mygroup")
	public void consumeFromTopic(String message) {


          logger.info("Consummed message " + message);
///		System.out.println("Consummed message "+message);
	}
	@KafkaListener(topics="mytopic2", groupId="mygroup")
	public void consumeFromTopic2(String message) {
		logger.info("Consummed message " + message);
///		System.out.println("Consummed message "+message);
	}

}
