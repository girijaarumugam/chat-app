package com.galata.servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * created by girija-4135 on 20/03/21
 */
public class CustomServletContextListener implements ServletContextListener {

    @Override public void contextInitialized(ServletContextEvent sce) {
        // Connect to database and create table for the first time
    }

    @Override public void contextDestroyed(ServletContextEvent sce) {
        // Disconnect database
    }
}
