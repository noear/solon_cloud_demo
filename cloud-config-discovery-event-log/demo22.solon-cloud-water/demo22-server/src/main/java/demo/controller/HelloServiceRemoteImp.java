package demo.controller;

import demo.protocol.HelloService;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;

/**
 * rpc 服务端(solon rpc 基于 uri 进行资源管理；可通过 uri 做多版本实现方式)
 * @author noear 2021/1/8 created
 */
@Mapping("/rpc/")
@Component(remoting = true)
public class HelloServiceRemoteImp implements HelloService {
    @Override
    public String hello() {
        return "remote: hello";
    }
}
