package demo.controller.event;

import org.noear.solon.annotation.Component;
import org.noear.solon.cloud.extend.cloudeventplus.CloudEventSubscribe;

/**
 * @author noear 2021/11/5 created
 */
@Component
public class HelloEntitySubscribe {
    @CloudEventSubscribe
    public boolean hello(HelloEntity event){
        System.out.println("HelloEntitySubscribe:: " + event.name);
        return true;
    }
}
