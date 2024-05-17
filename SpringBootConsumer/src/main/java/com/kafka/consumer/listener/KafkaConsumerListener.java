package com.kafka.consumer.listener;


import com.kafka.avro.dto.Empleado;
import com.kafka.avro.dto.Student;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {

    private Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = {"operaciones-archivo"}, groupId = "ventas-groupId")
    void listener(ConsumerRecord<String, Student> message) {

        String key = message.key();
        Student value = message.value();
        LOGGER.info("Mensaje recibido: Key " + key);
        LOGGER.info("FirstName : " + value.getFirstName());
        LOGGER.info("LastName : " + value.getLastName());
        LOGGER.info("Email : " + value.getEmail());
        LOGGER.info("Edad : " + value.getAge());


    }

    @KafkaListener(topics = {"operacionesEmpleado"}, groupId = "empleado-groupId")
    void listenerEmpleado (ConsumerRecord<String, Empleado> mensaje){

    }
}
