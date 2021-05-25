package demo.controller;

import com.xxl.job.core.handler.IJobHandler;
import org.noear.solon.cloud.annotation.CloudJob;

/**
 * @author noear 2021/5/25 created
 */
@CloudJob("JobHandlerDemo3")
public class JobHandlerDemo3 extends IJobHandler {
    @Override
    public void execute() throws Exception {
        System.out.println("JobHandlerDemo3");
    }
}
