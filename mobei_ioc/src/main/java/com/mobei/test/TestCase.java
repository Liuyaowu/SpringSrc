package com.mobei.test;

import com.mobei.aop.AppConfig;
import com.mobei.beanfactorypostprocessor.MyBeanFactoryPostProcessor;
import com.mobei.dao.EnhancerDao;
import com.mobei.dao.TestDao;
import com.mobei.methodinterceptor.MyMethodInterceptor;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
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
	ac.register(TestDao.class);
	ac.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
//		ac.registerBean(IndexDao.class);
		//初始化spring的环境
		ac.refresh();

//	MyRegistrarDao myRegistrarDao = (MyRegistrarDao) ac.getBean("myRegistrarDao");
//	MyRegistrarDao myRegistrarDao = ac.getBean(MyRegistrarDao.class);
//	System.out.println("---" + myRegistrarDao);
//	myRegistrarDao.find();
//	System.out.println("+++" + myRegistrarDao);
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


	/***************************************************/
	Enhancer enhancer = new Enhancer();
	enhancer.setSuperclass(EnhancerDao.class);
	enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
	enhancer.setCallback(new MyMethodInterceptor());
	enhancer.create();
}

}
