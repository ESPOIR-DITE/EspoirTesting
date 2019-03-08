package company.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="student")
    public People getService(){return new Student(); }

    @Bean(name="lecture")
    public People getService1(){return new Lecture();}
}
