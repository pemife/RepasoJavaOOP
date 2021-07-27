package jerarquia;

import java.util.ArrayList;

public class Animal {
	
	private int legs;
	private int ears;
	private int eyes;
	private String name;
	private String family;
	private ArrayList<Animal> descendants;
	
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
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getEars() {
		return ears;
	}

	public void setEars(int ears) {
		this.ears = ears;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public ArrayList<Animal> getDescendants() {
		return descendants;
	}

	public void setDescendants(ArrayList<Animal> descendants) {
		this.descendants = descendants;
	}

	public void reproduce() {
		Animal descendant = new Animal();
		this.descendants.add(descendant);
	}
	
	public String toString() {
		return this.getName() + " - " + this.getClass();
	}
}
