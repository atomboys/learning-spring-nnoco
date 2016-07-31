package com.github.atomboys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
public class WebConfig {
//	@Bean
//	public FreeMarkerViewResolver freeMarkerViewResolver() {
//		FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
//		resolver.setCache(false);
//		resolver.setSuffix(".ftl");
//		return resolver;
//	}
//	
//	@Bean
//	public FreeMarkerConfig freeMarkerConfigurer() {
//		FreeMarkerConfigurer config = new FreeMarkerConfigurer();
//		config.setTemplateLoaderPath("/templates/");
//		return config;
//	}
}
