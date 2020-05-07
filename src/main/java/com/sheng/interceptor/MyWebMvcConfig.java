package com.sheng.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author steven.sheng
 * @Date 2020/5/7/00717:06
 */
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Bean
    public MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor())
                .addPathPatterns("/*")
                .excludePathPatterns("/exclude");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
