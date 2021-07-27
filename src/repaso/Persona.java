package repaso;

public class Persona {
	private int age;
	private int height;
	private String name;
	private double weight;
	
	public Persona() {
		this(28, 10, 60);
	}

	public Persona(int edad) {
		this.age = edad;
	}
	
	public Persona(int edad, int height, double weight) {
		this.age = edad;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void walk(int speed) {
		if (speed > 10) {			
			System.out.println("walking");
		}
	}
	
	public void sleep() {
		System.out.println("sleeping");
	}
	
	public void takeShower(){
		System.out.println("showering");
	}
}
