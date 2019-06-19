package com.mobei.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mobei")
//@MyEnableProxy
//@Import({ImportDao.class, MySelector.class})
public class AppConfig {
}
