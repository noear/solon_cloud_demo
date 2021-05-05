package demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.logging.utils.TagsMDC;
import org.slf4j.MDC;

/**
 * @author noear 2021/5/5 created
 */
@Slf4j
public class LogController {
    @Mapping("/")
    public String hello(String name){
        //将语议固化为 tag0 ... tag4；利于做日志索引
        TagsMDC.tag0("user_"+name); //相当于 MDC.put("tag0", "user_"+name);

        log.info("有用户来了");

        return name;
    }
}
