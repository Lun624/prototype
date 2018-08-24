package xyz.masaimara.prototype.application.config.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:/log.properties", "classpath:/multipart.properties", "classpath:/oauth.properties"})
public class WebMvcConfiguration {
}
