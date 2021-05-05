package demo.controller;

import org.noear.solon.annotation.Controller;
import org.noear.solon.cloud.CloudClient;
import org.noear.solon.core.handle.Context;
import org.noear.water.utils.IPUtils;

/**
 * @author noear 2021/5/5 created
 */
@Controller
public class ListController {
    public void hello(Context ctx){
        String ip = IPUtils.getIP(ctx);

        if(CloudClient.list().inListOfIp("", ip) == false){
            return;
        }

        //业务处理...
    }
}
