package demo.controller;

import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;

/**
 * @author noear 2021/5/5 created
 */
@Mapping("/rpc/")
@Component(remoting = true)
public class HelloServiceImpl implements HelloService{

    @Override
    public String hello(String name) {
        return null;
    }
}
