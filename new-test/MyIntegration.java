package com.example.integration.config;

import org.apache.camel.Configuration;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;


@Configuration
public class MyIntegration extends RouteBuilder {

    //private static final Logger LOG = LogManager.getLogger(MyIntegration.class);

    @Override
    public void configure() throws Exception{
        //LogComponent log = new LogComponent();
        //LOG.atInfo().addKeyValue("companyId",12).log();

        // Устанавливаем пользовательский обработчик логов
        /*log.setExchangeFormatter(exchange -> {
            // Получаем тело сообщения и добавляем новое поле в JSON
            Message body = exchange.getMessage();
            body.setHeader("companyId", 12);
            body.setHeader("flowId", 13);
            exchange.setMessage(body);
            String newLogEntry = ", " + "\"customField\":" + "\"customValue\"";
            // Возвращаем модифицированную запись лога
            return newLogEntry;
        });*/

        // Добавляем компонент логирования к контексту Camel
        /*getContext().addComponent("log", log);
        getContext().addService(LOG);*/

        /*from("timer:fetchDataTimer?period=5000")
                .setHeader("CamelHttpMethod").constant("GET")
                .setHeader("Content-Type").constant("application/json")
                .setHeader("Authorization").constant("Basic dXNlckBuYXRpb25hbDEyVDE6TWFzdGVyMUAz")
                .setHeader("BUName").constant("Ui1NYXRl")
                .log("Before calling web service")
                .to("http://46.38.61.119:8080/fieldMapping/search/findMappings?source=rmate")
                .log("After calling web service. Response: ${body}");*/
        from("timer:java?period=3000")
                .log(LoggingLevel.INFO,"First Integration");

        //LOG.atInfo().addKeyValue("companyId",12).log();
    }
}
