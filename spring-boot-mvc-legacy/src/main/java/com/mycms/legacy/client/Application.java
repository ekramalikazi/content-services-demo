package com.mycms.legacy.client;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;


@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override 
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	} 

	@Bean 
	public LocaleChangeInterceptor localeChangeInterceptor() { 
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("language");
		return localeChangeInterceptor;
	} 


	@Bean(name = "localeResolver") 
	public CookieLocaleResolver localeResolver() { 
		CookieLocaleResolver localeResolver = new CookieLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		localeResolver.setCookieName("myLocaleCookie");
		localeResolver.setCookieMaxAge(4800);
		return localeResolver;
	} 


	@Bean 
	public ReloadableResourceBundleMessageSource messageSource() { 
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		//messageSource.setBasename("classpath:messages");
		messageSource.setBasename("https://f5e7f880982891ac9706-e5c0219873ad8795a9639814b3997e0e.ssl.cf1.rackcdn.com/messages");
		messageSource.setCacheSeconds(10); //reload messages every 1 seconds
		return messageSource;
	}
}
