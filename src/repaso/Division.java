package repaso;

public class Division extends Operator {
	
	public Division() {
		super("/");
	}
	
	@Override
	public double operate(double op1, double op2) {
		return op1 / op2;
	}
}
