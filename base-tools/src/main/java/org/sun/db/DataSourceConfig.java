package org.sun.db;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.google.common.collect.Lists;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {

    // 指定环境下dev 开启监控
    @Bean
    @Profile("dev")
    public FilterRegistrationBean druidFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new WebStatFilter());
        Map<String, String> intParams = new HashMap<>();
        intParams.put("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        registration.setName("DruidWebStatFilter");
        registration.setUrlPatterns(Lists.newArrayList("/*"));
        registration.setInitParameters(intParams);
        return registration;
    }

    //数据源监控
    @Bean
    @Profile("dev")
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean registration = new ServletRegistrationBean();
        registration.setServlet(new StatViewServlet());
        registration.setName("druid");
        registration.setUrlMappings(Lists.newArrayList("/druid/*"));
        //自定义添加初始化参数
        Map<String, String> intParams = new HashMap<>();
        intParams.put("loginUsername", "druid");
        intParams.put("loginPassword", "druid");
        registration.setName("DruidWebStatFilter");
        registration.setInitParameters(intParams);
        return registration;
    }
}