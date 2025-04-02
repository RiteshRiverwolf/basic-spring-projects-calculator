package Calculator;
import org.springframework.stereotype.Component;

@Component
public class DivisionService implements MathService{

	@Override
	public void operate(int x, int y) {
		// TODO Auto-generated method stub
		if(y==0) {
			System.out.println("not possible div by 0");
		}else {
        System.out.println("Subtraction: " + (x/y));
		}

	}
}
