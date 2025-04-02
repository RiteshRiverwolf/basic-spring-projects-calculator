package Calculator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Calculator")  // Ensure this package is scanned
public class AppConfig {
}
