package demo;

import org.noear.solon.Solon;
import org.noear.solon.cloud.CloudClient;
import org.slf4j.MDC;

/**
 * @author noear 2021/5/5 created
 */
public class DemoApp {
    public static void main(String[] args) {
        Solon.start(DemoApp.class, args, app -> {
            app.get("/", c -> c.output("Hello world!"));
        }).before("**", c -> {
            //将TraceId同步到slf4j
            String traceId = CloudClient.trace().getTraceId();
            MDC.put(CloudClient.trace().HEADER_TRACE_ID_NAME(), traceId);
        });
    }
}
