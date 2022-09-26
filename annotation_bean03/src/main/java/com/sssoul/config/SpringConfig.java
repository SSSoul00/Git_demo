package com.sssoul.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.sssoul.service","com.sssoul.dao"})
@Import(JdbcConfig.class)
@PropertySource("jdbc.properties")
public class SpringConfig {
}
