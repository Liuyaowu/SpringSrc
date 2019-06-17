package com.mobei.aop;


import com.mobei.dao.ImportDao;
import com.mobei.importselector.MySelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.mobei")
//@MyEnableProxy
@Import({ImportDao.class, MySelector.class})
public class AppConfig {
}
