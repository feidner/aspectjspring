package hfe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class HfeConfig {

    @Bean
    public Start start() {
        return new Start();
    }

    @Bean
    public StartAspect startAspect() {
        return new StartAspect();
    }
}
