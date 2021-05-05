package demo;

import com.zaxxer.hikari.HikariDataSource;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.cloud.annotation.CloudConfig;

import javax.sql.DataSource;

/**
 * @author noear
 */
@Configuration
public class Config {
    @Bean
    public DataSource ds(@CloudConfig("demo.ds") HikariDataSource ds){
        return ds;
    }
}
