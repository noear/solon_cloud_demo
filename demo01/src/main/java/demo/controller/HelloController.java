package demo.controller;

import org.noear.nami.annotation.NamiClient;
import org.noear.solon.annotation.Controller;

/**
 * @author noear 2021/5/5 created
 */
@Controller
public class HelloController {
    @NamiClient(name="hellorpc", path = "/rpc/")
    HelloService helloService;

    public String hello(String name){
        return helloService.hello(name);
    }
}
