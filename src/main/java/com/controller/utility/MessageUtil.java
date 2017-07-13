package com.controller.utility;


import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@PropertySource("classpath:message.properties")
public class MessageUtil {

	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name = "messages")
	public static PropertiesFactoryBean mapper() {
	        PropertiesFactoryBean bean = new PropertiesFactoryBean();
	        bean.setLocation(new ClassPathResource(
	                "message.properties"));
	        return bean;
	}
}