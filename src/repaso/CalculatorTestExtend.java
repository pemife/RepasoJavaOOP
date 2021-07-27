package repaso;

public class CalculatorTestExtend {

	public static void main(String[] args) {
		Multiplication mp = new Multiplication();
		
		System.out.printf("%f %s %f = %f", 2.0, mp.getOperador(), 5.0, mp.operate(2, 5));
	}
}
