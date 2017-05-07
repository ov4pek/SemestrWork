package ru.kpfu.itis.configs;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Created by UseR7 on 03.05.2017.
 */
public class WebInitializer extends AbstractDispatcherServletInitializer {

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext cfg = new AnnotationConfigWebApplicationContext();
        cfg.register(WebConfig.class);
        return cfg;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext cfg = new AnnotationConfigWebApplicationContext();
        cfg.register(RootConfig.class);
        return cfg;
    }
}


