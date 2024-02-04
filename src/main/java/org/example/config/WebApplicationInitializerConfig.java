package org.example.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class WebApplicationInitializerConfig implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
        root.scan("org.example");
        var dispatcher = servletContext.addServlet("dispatcher",new DispatcherServlet(root));
      dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");


    }
}
