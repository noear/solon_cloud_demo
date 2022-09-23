import demo12.Demo12App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.noear.solon.Utils;
import org.noear.solon.test.HttpTestBase;
import org.noear.solon.test.SolonJUnit4ClassRunner;
import org.noear.solon.test.SolonTest;

import java.util.concurrent.CountDownLatch;

/**
 * @author noear 2021/5/6 created
 */
@RunWith(SolonJUnit4ClassRunner.class)
@SolonTest(Demo12App.class)
public class LimiterTest extends HttpTestBase {
    @Test
    public void test() throws Exception{
        CountDownLatch  count = new CountDownLatch(1);
        for (int i = 0; i < 100; i++) {
            Utils.async(()->{
                try{
                    path("/").get();
                }catch (Exception e){
                    e.printStackTrace();
                }

                count.countDown();
            });
        }

        count.await();
    }
}
