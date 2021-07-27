package repaso;

public class Animal {
	
	private int legs;
	private int ears;
	private int eyes;
	private String name;
	private String family;
	
	public Animal() {
		this.legs = 4;
		this.ears = 2;
		this.eyes = 2;
	}

	public Animal(int legs, int ears, int eyes) {
		this.legs = legs;
		this.ears = ears;
		this.eyes = eyes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}
	
	
}
