package Calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Calculator calculator = context.getBean(Calculator.class);
        
        calculator.compute("add", 10, 5);
        calculator.compute("subtract", 20, 5);
        calculator.compute("multiply", 6, 7);
        calculator.compute("divide", 15, 3);
    }
}
