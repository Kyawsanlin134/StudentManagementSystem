package com.demo.student.stduentdemo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.FileTemplateResolver;

import javax.annotation.PostConstruct;

@Configuration
    public class ThymeleafResolver {

        @Autowired
        private SpringTemplateEngine templateEngine;

        @PostConstruct
        public void extension() {
            FileTemplateResolver resolver = new FileTemplateResolver();
            resolver.setPrefix("D:\\templates\\");
            resolver.setSuffix(".html");
            resolver.setTemplateMode("HTML5");
            resolver.setOrder(templateEngine.getTemplateResolvers().size());
            resolver.setCacheable(false);
            templateEngine.addTemplateResolver(resolver);
        }
    }

