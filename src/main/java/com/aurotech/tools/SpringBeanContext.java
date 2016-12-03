package com.aurotech.tools;

import org.springframework.context.ApplicationContext;

public final class SpringBeanContext {
	
	private  ApplicationContext context;
	
	private static SpringBeanContext springContext = null;

	private SpringBeanContext(ApplicationContext context2) {
		this.context = context2;
	}


	private   SpringBeanContext() {
		// TODO Auto-generated constructor stub
	}


	public  ApplicationContext getContext() {
		return context;
	}

	
	public  static SpringBeanContext getInstance() {
		
		if (springContext == null){
			springContext = new SpringBeanContext();
		}
		return springContext;
	}
	
public static SpringBeanContext prepareInstance( ApplicationContext context) {
		
		if (springContext == null){
			springContext = new SpringBeanContext(context );
		}
		return springContext;
	}
	
	
}
