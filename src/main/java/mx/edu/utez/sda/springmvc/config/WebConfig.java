package mx.edu.utez.sda.springmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/people").setViewName("people");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/error").setViewName("error");
        registry.addViewController("/categories/adultos").setViewName("adultos");
        registry.addViewController("/categories/economia").setViewName("economia");
        registry.addViewController("/categories/guerra").setViewName("guerra");
        registry.addViewController("/categories/caricaturas").setViewName("caricaturas");
        registry.addViewController("/categories/familiares").setViewName("familiares");
        registry.addViewController("/categories/animadas").setViewName("animadas");
    }
}
