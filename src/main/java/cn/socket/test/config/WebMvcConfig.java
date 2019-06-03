package cn.socket.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
/**
 * @author likaixuan email:likaixuan(a)innodev.com.cn
 * @Date: 2019/6/3 16:09
 * @Version 1.0
 */
public class WebMvcConfig extends WebMvcConfigurerAdapter{
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry){
        viewControllerRegistry.addViewController("/login").setViewName("/login");
        viewControllerRegistry.addViewController("/chat").setViewName("/chat");
    }
}