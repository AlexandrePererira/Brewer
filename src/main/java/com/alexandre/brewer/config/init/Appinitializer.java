package com.alexandre.brewer.config.init;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.alexandre.brewer.config.WebConfig;

public class Appinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
	
		return new String[] {"/"};
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characaterEncondingFilter = new CharacterEncodingFilter();
		characaterEncondingFilter.setEncoding("UTF-8");
		characaterEncondingFilter.setForceEncoding(true);
		return new Filter[] {characaterEncondingFilter};
	}
}
