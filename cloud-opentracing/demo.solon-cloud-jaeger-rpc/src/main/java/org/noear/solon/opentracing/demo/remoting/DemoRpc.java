package org.noear.solon.opentracing.demo.remoting;

import org.noear.solon.Solon;
/**
 * @author noear 2021/6/10 created
 */
public class DemoRpc {
    public static void main(String[] args) {
        Solon.start(DemoRpc.class, args, app-> app.enableSocketD(true));
    }
}
