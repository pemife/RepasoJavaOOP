package jerarquia;

public abstract class Insecto extends Animal implements Oviparo {
	
	private int nHuevos;
	
	public void ponerHuevo() {
		this.nHuevos++;
	}
	
	public void incubar() {
		System.out.println(this.getName() + " está incubando");
	}

	public int getnHuevos() {
		return nHuevos;
	}

	public void setnHuevos(int nHuevos) {
		this.nHuevos = nHuevos;
	}
}
