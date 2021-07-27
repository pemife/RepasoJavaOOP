package repaso;

public class Substraction extends Operator {
	
	public Substraction() {
		super("-");
	}
	
	@Override
	public double operate(double op1, double op2) {
		return op1 - op2;
	}
}
