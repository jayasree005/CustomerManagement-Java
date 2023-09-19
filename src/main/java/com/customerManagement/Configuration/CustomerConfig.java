package com.customerManagement.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.customerManagement"})
public class CustomerConfig implements WebMvcConfigurer
{
	@Bean
	  public InternalResourceViewResolver viewResolver()
	  {
		  InternalResourceViewResolver vr = new InternalResourceViewResolver();
		  vr.setPrefix("/WEB-INF/view/");
		  vr.setSuffix(".jsp");
		  return vr;
	  }
	
	  @Bean
	  public JdbcTemplate jdbcTemplate()
	  {
		  JdbcTemplate jdbctemplate = new JdbcTemplate(dataSource());
		  return jdbctemplate;
	  }
	  
	  @Bean
	  public DriverManagerDataSource dataSource()
	  {
		 DriverManagerDataSource datasource =  new DriverManagerDataSource();;
		  
		 datasource.setUrl("jdbc:mysql://localhost:3306/customermanagement");
		 datasource.setUsername("root");
		 datasource.setPassword("Jayasree@05");
		 datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 
		 return datasource;
	  }
	  
	  @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) 
	  {
		  registry.addResourceHandler("/urltoresoucefolder/**").addResourceLocations("/Resources");
	  }
	  
}
