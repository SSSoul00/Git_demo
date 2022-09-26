package com.sssoul.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Spring注解方式配置文件
 */
@Configuration
//扫描Bean
@ComponentScan("com.sssoul")
//导入properties文件
@PropertySource("classpath:jdbc.properties")
//导入第三方bean
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
