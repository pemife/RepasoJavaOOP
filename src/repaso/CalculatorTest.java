package repaso;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator calculadora = new Calculator();
		
		calculadora.setOp1(5.2);
		calculadora.setOp2(3.5);
		calculadora.setOpx("+");
		
//		System.out.println(calculadora.getOp1() + " " + calculadora.getOpx() + " " + calculadora.getOp2() + " = " + calculadora.operate());
		System.out.printf("%.1f %s %.1f = %.1f", calculadora.getOp1(), calculadora.getOpx(), calculadora.getOp2(), calculadora.operate());
	}
}