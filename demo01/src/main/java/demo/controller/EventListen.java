package demo.controller;

import org.noear.solon.cloud.CloudEventHandler;
import org.noear.solon.cloud.annotation.CloudEvent;
import org.noear.solon.cloud.model.Event;

/**
 * @author noear 2021/5/5 created
 */
@CloudEvent("user.registered")
public class EventListen implements CloudEventHandler {
    @Override
    public boolean handler(Event event) throws Throwable {
        //用户注册完成后，送个多币...
        return true;
    }
}
