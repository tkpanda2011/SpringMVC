package com.aurotech.mvc.servlet;
   
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurotech.tools.SpringBeanContext;

/**
 *     Servlet implementation class OnLoadServlet
 */
public class OnLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public OnLoadServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
		 System.out.println("Adding The Logger");
		 SpringBeanContext.prepareInstance(context);
		 System.out.println("Its loaded");
	}

}
