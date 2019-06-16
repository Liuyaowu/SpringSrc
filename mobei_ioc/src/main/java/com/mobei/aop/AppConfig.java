package com.mobei.aop;


import com.mobei.anno.MyEnableProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mobei")
@MyEnableProxy
public class AppConfig {
}
