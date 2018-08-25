package xyz.masaimara.prototype.data.rdb.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * configuration data sources
 */

@Configuration
@PropertySource({"classpath:/datasource.properties", "classpath:/mybatis.properties"})
public class DataAccessConfiguration {

    @Bean
    @Primary
    @Qualifier("prototypeDataSource")
    public DataSource dataSource(DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().type(HikariDataSource.class)
                .build();
    }

//    @Bean
//    public TransactionFactory mybatisTransactionFactory() {
//        return new JdbcTransactionFactory();
//    }

//    @Bean
//    @Qualifier("productEnvironment")
//    public Environment environment(TransactionFactory transactionFactory, @Qualifier("prototypeDataSource") DataSource dataSource) {
//        return new Environment("product", transactionFactory, dataSource);
//    }

//    @Bean
//    @Qualifier("productConfiguration")
//    public Configuration configuration(@Qualifier("productEnvironment") Environment environment) {
//        Configuration configuration = new Configuration(environment);
//        configuration.addMappers("xyz.masaimara.prototype", TestMapper.class);
//        return configuration;
//    }

//    @Bean
//    @Qualifier("productSqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("prototypeDataSource") DataSource dataSource, @Qualifier("productConfiguration") Configuration configuration) {
//        return new SqlSessionFactoryBuilder().build(configuration);
//    }
}