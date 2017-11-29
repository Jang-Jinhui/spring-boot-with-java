package configs;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@ComponentScan("me.hackers.controller")
public class ControllerConfigs implements WebMvcConfigurer {

}
