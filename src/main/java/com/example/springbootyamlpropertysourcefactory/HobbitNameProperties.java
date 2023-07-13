package com.example.springbootyamlpropertysourcefactory;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "hobbit")
@Getter
@Setter
@PropertySource(
    value = "classpath:config/hobbits.yml",
    factory = YamlPropertySourceFactory.class)
public class HobbitNameProperties {

  private Set<String> names;

}
