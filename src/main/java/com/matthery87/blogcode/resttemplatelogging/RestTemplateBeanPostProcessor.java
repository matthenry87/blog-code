package com.matthery87.blogcode.resttemplatelogging;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof RestTemplate) {

            RestTemplate restTemplate = (RestTemplate) bean;

            restTemplate.getInterceptors().add(new LoggingInterceptor());
        }

        return bean;
    }

}
