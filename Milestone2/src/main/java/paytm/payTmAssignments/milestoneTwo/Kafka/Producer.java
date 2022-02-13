package paytm.payTmAssignments.milestoneTwo.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    Logger logger = LoggerFactory.getLogger(Producer.class);

    public static final String topic = "mytopic";
    public static final String topic2 = "mytopic2";


    @Autowired
  private KafkaTemplate<String, String> kafkaTemp;
  
  public void publishToTopic(String message) {
      logger.info("Publishing to topic "+topic);
      logger.info("Publishing to topic "+topic2);

//      System.out.println("Publishing to topic "+topic);
//      System.out.println("Publishing to topic2 "+topic2);

      this.kafkaTemp.send(topic, message);
  }
    public void publishToTopic2(String message) {
        logger.info("Publishing to topic2 "+topic2);

//        System.out.println("Publishing to topic2  "+topic2);
        this.kafkaTemp.send(topic2, message);
    }
}
