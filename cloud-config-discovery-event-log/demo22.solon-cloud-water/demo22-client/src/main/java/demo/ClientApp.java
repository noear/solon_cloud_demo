package demo;

import lombok.extern.slf4j.Slf4j;
import org.noear.solon.Solon;
import org.noear.solon.cloud.CloudClient;
import org.noear.solon.cloud.model.Event;
import org.noear.water.utils.Datetime;

import java.util.Date;

/**
 * @author noear 2020/12/28 created
 */
@Slf4j
public class ClientApp {
    public static void main(String[] args) {
        Solon.start(ClientApp.class, args);

        log.info("系统启动了...");

        Date scheduled = Datetime.Now().addHour(1).getFulltime();
        CloudClient.event().publish(new Event("demo.test","{id:15}").scheduled(scheduled));
    }
}
