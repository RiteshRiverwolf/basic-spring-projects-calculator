package Calculator;
import org.springframework.stereotype.Component;

@Component
public class SubtractionService implements MathService{

	@Override 
	public void operate(int x, int y) {
		// TODO Auto-generated method stub
        System.out.println("Subtraction: " + (x - y));

	}
}