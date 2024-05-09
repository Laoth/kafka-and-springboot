package com.kafka.provider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    public NewTopic generateTopic() {

        /***
         * Metodo encargado de generar un topico si no existe, aqui se puede espeficiar:
         *  1) El numero de replicas
         *  2) El numero de particiones
         */
        Map<String, String> configuraciones = new HashMap<>();
        //politica de limpieza de mensaje, delete (borra mensaje), compact (mantiene el mas actual)
        configuraciones.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);

        //politica de retencion de mensaje, por default -1 (no lo almacena)
        configuraciones.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");

        //representa el tamaño maximo del segmeneto, defecto 1GB
        configuraciones.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824");

        //representa el tamaño maximo del mensaje, 1MB
        configuraciones.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012");

        return TopicBuilder.name("operaciones-archivo")
                .replicas(2)
                .partitions(3)
                .configs(configuraciones)
                .build();
    }
}
