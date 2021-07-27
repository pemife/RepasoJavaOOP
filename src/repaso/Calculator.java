package repaso;

public class Calculator {

	private double op1;
	private double op2;
	private String opx;
	
	public Calculator() {}

	public double getOp1() {
		return op1;
	}

	public void setOp1(double op1) {
		this.op1 = op1;
	}

	public double getOp2() {
		return op2;
	}

	public void setOp2(double op2) {
		this.op2 = op2;
	}

	public String getOpx() {
		return opx;
	}

	public void setOpx(String opx) {
		this.opx = opx;
	}
	
	public double operate() {
		switch (this.opx) {
		case "+":
			return op1 + op2;
		case "-":
			return op1 - op2;
		case "*":
			return op1 * op2;
		case "/":
			return op1 / op2;
		default:
			return 0;
		}
	}
}
