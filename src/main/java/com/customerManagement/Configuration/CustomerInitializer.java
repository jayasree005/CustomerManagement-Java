package com.customerManagement.Configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CustomerInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		Class fileConfig[] = {CustomerConfig.class};
		return fileConfig;
	}

	@Override
	protected String[] getServletMappings() 
	{
		String[] mappings = {"/"};
		return mappings;
	}

}
