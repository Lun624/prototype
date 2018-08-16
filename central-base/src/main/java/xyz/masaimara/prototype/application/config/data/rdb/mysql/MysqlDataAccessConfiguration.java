package xyz.masaimara.prototype.application.config.data.rdb.mysql;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * configuration data sources
 */

@Configuration
@EnableTransactionManagement
public class MysqlDataAccessConfiguration {

    @Autowired
    @Qualifier("dateSourceProperties")
    private DateSourceProperties dateSourceProperties;

    @Bean
    @Qualifier("prototypeDataSource")
    public DataSource prototypeDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dateSourceProperties.getUrl());
        config.setUsername(dateSourceProperties.getUsername());
        config.setPassword(dateSourceProperties.getPassword());
        config.setConnectionTimeout(dateSourceProperties.getConnectionTimeOut());
        config.setMaximumPoolSize(dateSourceProperties.getMaxPoolSize());
        config.setMinimumIdle(dateSourceProperties.getMinimumIdle());
        config.setDriverClassName(dateSourceProperties.getDriverClassName());
        config.addDataSourceProperty("cachePrepStmts", "true"); //是否自定义配置，为true时下面两个参数才生效
        config.addDataSourceProperty("prepStmtCacheSize", "500"); //连接池大小默认25，官方推荐250-500
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048"); //单条语句最大长度默认256，官方推荐2048
        config.addDataSourceProperty("useServerPrepStmts", "true"); //新版本MySQL支持服务器端准备，开启能够得到显著性能提升
        config.addDataSourceProperty("useLocalSessionState", "true");
        config.addDataSourceProperty("useLocalTransactionState", "true");
        config.addDataSourceProperty("rewriteBatchedStatements", "true");
        config.addDataSourceProperty("cacheResultSetMetadata", "true");
        config.addDataSourceProperty("cacheServerConfiguration", "true");
        config.addDataSourceProperty("elideSetAutoCommits", "true");
        config.addDataSourceProperty("maintainTimeStats", "false");

        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }

    @Bean
    @Qualifier("platformTransactionManager")
    public PlatformTransactionManager platformTransactionManager(@Qualifier("prototypeDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}