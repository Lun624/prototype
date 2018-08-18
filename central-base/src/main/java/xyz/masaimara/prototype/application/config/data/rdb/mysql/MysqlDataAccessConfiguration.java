package xyz.masaimara.prototype.application.config.data.rdb.mysql;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import xyz.masaimara.prototype.Mapper;
import xyz.masaimara.prototype.database.mapper.TestMapper;

import javax.sql.DataSource;

/**
 * configuration data sources
 */

@org.springframework.context.annotation.Configuration
public class MysqlDataAccessConfiguration {

    @Autowired
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }


    @Bean
    @Primary
    @Qualifier("prototypeDataSource")
    @ConfigurationProperties("spring.datasource")
    public DataSource bisonDataSource(DataSourceProperties properties) {
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