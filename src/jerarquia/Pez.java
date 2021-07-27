package jerarquia;

public class Pez extends Animal implements Oviparo {
	
	private int nHuevos;

	public void ponerHuevo() {
		this.nHuevos++;
	};
	
	public void incubar() {
		System.out.println(this.getName() + " está incubando");
	}
}
