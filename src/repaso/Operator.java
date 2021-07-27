package repaso;

public class Operator {
	private String operador;
	
	public Operator() {
		this.operador = "+";
	}
	
	public Operator(String operador) {
		this.operador = operador;
	}
	
	public String getOperador() {
		return this.operador;
	}
	
	public double operate(double op1, double op2) {
		return op1 + op2;
	}
}
