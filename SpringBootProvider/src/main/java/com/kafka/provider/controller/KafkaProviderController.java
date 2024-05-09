package com.kafka.provider.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProviderController {

    private Logger LOGGER = LoggerFactory.getLogger(KafkaProviderController.class);
    @Autowired
    KafkaTemplate kafkaTemplate;

    @PostMapping("/ventas/")
    void sendMessage(@RequestBody String data){

        LOGGER.info("Mensaje Recibido: " + data);
        kafkaTemplate.send("operaciones-archivo",data);

    }

}
