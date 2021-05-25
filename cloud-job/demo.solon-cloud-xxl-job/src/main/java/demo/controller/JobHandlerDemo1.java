package demo.controller;

import org.noear.solon.cloud.annotation.CloudJob;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Handler;

/**
 * @author noear 2021/5/25 created
 */
@CloudJob("JobHandlerDemo1")
public class JobHandlerDemo1 implements Handler {
    @Override
    public void handle(Context ctx) throws Throwable {
        System.out.println("JobHandlerDemo1");
    }
}
