package com.dev.springBoot;





import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//mapper인터페이스의 패키지 위치
@MapperScan(basePackages = "com.dev.springBoot.mapper")
@ComponentScan(basePackages = "com.dev.springBoot")
public class AppConfig implements WebMvcConfigurer {
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // URL: http://localhost:8080/res/**  →  실제: /resources/ 하위
        registry.addResourceHandler("/res/**")
                .addResourceLocations("/resources/");
    }

	@Bean
	public StandardServletMultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
		
}
