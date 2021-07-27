package repaso;

public class Multiplication extends Operator {

	public Multiplication() {
		super("*");
	}
	
	@Override
	public double operate(double op1, double op2) {
		return op1 * op2;
	}
}
