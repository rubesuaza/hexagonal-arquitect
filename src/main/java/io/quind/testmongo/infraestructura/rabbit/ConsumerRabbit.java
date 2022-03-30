package io.quind.testmongo.infraestructura.rabbit;

import io.quind.testmongo.aplicacion.comando.fabrica.FabricaPersona;
import io.quind.testmongo.dominio.modelo.Person;
import io.quind.testmongo.dominio.puerto.repositorio.RepositorioPersona;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;

@Component
@RabbitListener(queues = "${spring.rabbitmq.listener.order.queue.name}")
public class ConsumerRabbit {

    private static int countRecord=0;
    private static long totalTime= 0;


    @Autowired
    FabricaPersona fabricaPersona;
    @Autowired
    RepositorioPersona repositorioPersona;

    @RabbitHandler
    public void receiveMessage(@Payload HashMap<String, Object> message) throws IOException {
        long initialTime=Instant.now().toEpochMilli();
        Person person = fabricaPersona.mapToPerson(message);
        repositorioPersona.guardar(person);
        countRecord++;
        long timeProcess=Instant.now().toEpochMilli()-initialTime;
        totalTime+=timeProcess;
        System.out.println(String.format("numero de registros: %s\ntiempo transaccion a mongo(milisegundos): %s\ntiempo total (milisegundos): %s",countRecord,timeProcess,totalTime));
    }
}
