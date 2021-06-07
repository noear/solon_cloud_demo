package org.noear.solon.opentracing.demo.dso;

import org.noear.solon.Solon;
import org.noear.solon.core.LoadBalance;

/**
 * @author noear 2021/6/7 created
 */
public class LoadBalanceImpl implements LoadBalance {
    @Override
    public String getServer() {
        return "localhost:" + Solon.global().port();
    }
}
