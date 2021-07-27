package jerarquia;

public class Murcielago extends Mamifero implements Volador{

	public Murcielago() {
		this.setLegs(2);
		this.setEars(2);
		this.setEyes(2);
	}
	
	public void volar() {
		System.out.println(this.getName() + " está volando");
	}
}
