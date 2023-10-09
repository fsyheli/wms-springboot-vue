package heli.hrc.wmsspringboot.config;

import heli.hrc.wmsspringboot.fitter.MyTestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.DefaultLoginPageConfigurer;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @PACKAGE_NAME: heli.hrc.wmsspringboot.config
 * @NAME: WebSecurityConfig
 * @USER: FSY
 * @DATE: 2023/10/9 0009
 * @TIME: 13:30
 * @YEAR: 2023
 * @MONTH_NAME_SHORT: 10月
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: wms-springboot
 * @Description:
 */
@Configuration
@EnableWebMvc
public class WebSecurityConfig implements WebMvcConfigurer {

    /**
     * 配置这个
     * @return
     */
    @Bean
    public WebSecurityConfigurerAdapter loginPageConfig()
    {
        return new WebSecurityConfigurerAdapter() {
            @Override
            protected void configure(HttpSecurity http) throws Exception {
                //移除默认的登录页面
                http.removeConfigurer(DefaultLoginPageConfigurer.class);
            }
        };
    }

    /**
     * 配置视图解析器
     * @param registry
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        WebMvcConfigurer.super.configureViewResolvers(registry);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);
        registry.addViewController("/index").setViewName("login");
    }



    /**
     * 添加拦截器：拦截一些url
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(new MyTestInterceptor()).addPathPatterns("/**")
                //放开登录页面和静态资源
                .excludePathPatterns("/**/toLogin","/**/login","/js/**","/css/**","/images/**");
    }

}
