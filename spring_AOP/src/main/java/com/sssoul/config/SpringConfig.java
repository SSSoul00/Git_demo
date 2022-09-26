package com.sssoul.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.sssoul")
@EnableAspectJAutoProxy
public class SpringConfig {
}
