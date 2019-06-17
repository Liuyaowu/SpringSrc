package com.mobei.test;

import com.mobei.aop.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCase {

public static void main(String[] args) {
	//spring前提环境准备
	//1.准备工厂=DefaultListableBeanFactory
	//2.实例化一个bdReader和一个scanner
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext();
		//把一个class转成beandefinition,最后put到map(DefaultListableBeanFactory的一个变量:beanDefinitionMap)中
	ac.register(AppConfig.class);

//		ac.registerBean(IndexDao.class);
		//初始化spring的环境
		ac.refresh();
//		ac.close();

//	AnnotationConfigApplicationContext ac =
//			new AnnotationConfigApplicationContext(AppConfig.class);
//	IndexDao dao = ac.getBean(IndexDao.class);
//dao.query();
//
//	ImportSelectorDao importDao = 	ac.getBean(ImportSelectorDao.class);
//	System.out.println(importDao);
	//	IndexDao dao1 = ac.getBean(IndexDao.class);

//	dao.query();

//	System.out.println(dao.hashCode() + "   " + dao1.hashCode());
}

}
