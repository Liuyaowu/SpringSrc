package com.mobei.aop;


import com.mobei.anno.MyScan;
import com.mobei.dao.BeanDao1;
import com.mobei.dao.BeanDao2;
import com.mobei.dao.ImportDao;
import com.mobei.importbeandefinitionregistrar.MyImportBeanDefinitionRegistrar;
import com.mobei.importselector.MySelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.mobei")
@MyScan
//@Import(MyImportBeanDefinitionRegistrar.class)
//@Import(AppConfig2.class)
//@MyEnableProxy
@Import({ImportDao.class, MySelector.class, MyImportBeanDefinitionRegistrar.class})
//@Order
public class AppConfig {

	@Bean
	public BeanDao1 beanDao1(){
		return new BeanDao1();
	}

	@Bean
	public BeanDao2 beanDao2(){
		beanDao1();//如果不加@Configuration,BeanDao1的构造函数会执行两遍,加了只执行一遍
		return new BeanDao2();
	}


}
