package xyz.masaimara.prototype.application.config.data.rdb.mysql;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dateSourceProperties")
@PropertySource("classpath:/datasource.properties")
class DateSourceProperties {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.hikari.data-source-class-name}")
    private String datasourceName;
    @Value("${spring.datasource.hikari.connection-timeout}")
    private long connectionTimeOut;
    @Value("${spring.datasource.hikari.maximum-pool-size}")
    private int maxPoolSize;
    @Value("${spring.datasource.hikari.minimum-idle}")
    private int minimumIdle;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getDatasourceName() {
        return datasourceName;
    }

    public long getConnectionTimeOut() {
        return connectionTimeOut;
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public int getMinimumIdle() {
        return minimumIdle;
    }
}
