package com.kafka.provider.controller;



import com.kafka.avro.dto.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class KafkaProviderController {

    private Logger LOGGER = LoggerFactory.getLogger(KafkaProviderController.class);
    @Autowired
    KafkaTemplate kafkaTemplate;

    @PostMapping("/ventas/")
    String sendMessage(@RequestBody Student student){

        LOGGER.info("Mensaje Recibido: " + student);
        kafkaTemplate.send("operaciones-archivo", UUID.randomUUID().toString(),student);
        return "mensaje enviado";

    }

}
