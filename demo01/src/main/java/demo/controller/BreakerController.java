package demo.controller;

import org.noear.solon.annotation.Mapping;
import org.noear.solon.cloud.annotation.CloudBreaker;

/**
 * @author noear 2021/5/5 created
 */
@CloudBreaker("main")
public class BreakerController {
    @Mapping("/breaker")
    public void breaker(){

    }
}
