package com.ejemplo;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        // Usa un directorio temporal para docBase
        String contextPath = "";
        String docBase = System.getProperty("java.io.tmpdir");
        Context ctx = tomcat.addContext(contextPath, docBase);

        Tomcat.addServlet(ctx, "holaServlet", new HolaServlet());
        ctx.addServletMappingDecoded("/hola", "holaServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}