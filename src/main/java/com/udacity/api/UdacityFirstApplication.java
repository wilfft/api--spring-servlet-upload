package com.udacity.api;

import com.udacity.api.servlet.HelloFilter;
import com.udacity.api.servlet.HelloListener;
import com.udacity.api.servlet.HelloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class UdacityFirstApplication {

    // REGISTER SERVLET
    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean servletBean = new ServletRegistrationBean(new HelloServlet());
        servletBean.addUrlMappings("/helloServlet");
        return servletBean;
    }
    // FILTER
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean filterBean = new FilterRegistrationBean(new HelloFilter());
        filterBean.addUrlPatterns("/helloServlet");
        return filterBean;
    }
    //Listener
    @Bean
    public ServletListenerRegistrationBean<HelloListener> getServletListenerRegistrationBean(){
         ServletListenerRegistrationBean listenerBean = new ServletListenerRegistrationBean(new HelloListener());

  return listenerBean;
    }

    public static void main(String[] args) {
	SpringApplication.run(UdacityFirstApplication.class, args);



    }

}
