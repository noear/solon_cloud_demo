package demo.controller;

import org.noear.solon.cloud.CloudClient;
import org.noear.solon.cloud.model.Event;

/**
 * @author noear 2021/5/5 created
 */
public class EventController {
    public void onUserRegistered(long user_id) {
        CloudClient.event().publish(
                new Event("user.registered", String.format("{\"user_id\":%d}", user_id)));
    }
}
