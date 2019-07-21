package com.mobei.test;

import com.mobei.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCase {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(AppConfig.class);
//		ac.getBean(MailBean.class).sendMail();
//		ac.start();
	}
}
