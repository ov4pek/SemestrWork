package ru.kpfu.itis.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import ru.kpfu.itis.loggers.WebServiceLogger;

@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@ComponentScan({"ru.kpfu.itis.controllers", "ru.kpfu.itis.services"})
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public FreeMarkerViewResolver freemarkerViewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setCache(true);
        resolver.setPrefix("");
        resolver.setSuffix(".ftl");
        return resolver;
    }

    @Bean
    public FreeMarkerConfigurer freemarkerConfig() {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/frmrkr/");
        return freeMarkerConfigurer;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        registry.addResourceHandler("/resources/js/**").addResourceLocations("/resources/js/");
        registry.addResourceHandler("/resources/css/**").addResourceLocations("/resources/css/");
        registry.addResourceHandler("/resources/sass/**").addResourceLocations("/resources/sass/");
        registry.addResourceHandler("/resources/font/**").addResourceLocations("/resources/font/");
        registry.addResourceHandler("/resources/images/**").addResourceLocations("/resources/images/");
        registry.addResourceHandler("/resources/partials/**").addResourceLocations("/resources/partials/");
        registry.addResourceHandler("/resources/scss/**").addResourceLocations("/resources/scss/");

    }
    @Bean
    public WebServiceLogger webServiceLogger(){
        return new WebServiceLogger();
    }
}
