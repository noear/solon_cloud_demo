package demo.controller;

import org.noear.solon.cloud.annotation.CloudJob;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author noear 2021/5/25 created
 */
@CloudJob("JobHandlerDemo1")
public class JobHandlerDemo1 implements Handler {
    static final Logger log = LoggerFactory.getLogger(JobBeanDemo2.class);

    @Override
    public void handle(Context ctx) throws Throwable {
        log.info("JobHandlerDemo1");
    }
}
