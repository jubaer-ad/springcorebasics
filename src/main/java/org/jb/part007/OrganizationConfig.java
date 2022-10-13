package org.jb.part007;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jb.part007")
public class OrganizationConfig {
    @Bean
    public Bar bar001() {
        return new Bar();
    }
    @Bean({"b1", "b2"})
    public Bar bar002() {
        return new Bar();
    }
}
