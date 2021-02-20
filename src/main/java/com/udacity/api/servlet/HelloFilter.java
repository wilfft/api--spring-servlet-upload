package com.udacity.api.servlet;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "helloFilter", urlPatterns = "/helloServlet")
public class HelloFilter implements javax.servlet.Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Executando o método doFilter ");
        chain.doFilter(request, response);
        System.out.println("Filtro executado");
    }
}
