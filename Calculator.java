package Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	@Autowired
    private AdditionService additionService;
    @Autowired
    private SubtractionService subtractionService;
    @Autowired
    private MultiplicationService multiplicationService;
    @Autowired
    private DivisionService divisionService;
    
    public void compute(String operation, int x, int y) {
        switch (operation.toLowerCase()) {
            case "add":
                additionService.operate(x, y);
                break;
            case "subtract":
                subtractionService.operate(x, y);
                break;
            case "multiply":
                multiplicationService.operate(x, y);
                break;
            case "divide":
                divisionService.operate(x, y);
                break;
            default:
                System.out.println("Invalid operation: " + operation);
        }
    } 
}
