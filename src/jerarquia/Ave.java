package jerarquia;

public abstract class Ave extends Animal implements Oviparo {

	private int nHuevos;
	private int nAlas;
	
	public void ponerHuevo() {
		this.nHuevos++;
	}
	
	public void incubar() {
		System.out.println(this.getName() + " está incubando");
	}
}
