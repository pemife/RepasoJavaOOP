package jerarquia;

public abstract class Mamifero extends Animal {

	private int nMamas;
	
	public void amamantar() {
//		if (this.nMamas > 0) {			
			System.out.println(this.getName() + " está amamantando");
//		}
	}

	public int getnMamas() {
		return nMamas;
	}

	public void setnMamas(int nMamas) {
		this.nMamas = nMamas;
	}
}
