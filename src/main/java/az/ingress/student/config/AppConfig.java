package az.ingress.student.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class AppConfig {
    public String name;
    public String version;
    private List<String> developers;
    private Map<String,String> numbers;
}
