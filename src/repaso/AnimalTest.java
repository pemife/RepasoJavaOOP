package repaso;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal cow = new Animal();
		Animal goat = new Animal();
		Animal anthilope = new Animal();
		
		cow.setName("Cow");
		goat.setName("Goat");
		anthilope.setName("Anthilope");
		
		System.out.println(cow.getName());
		System.out.println(goat.getName());
		System.out.println(anthilope.getName());
	}
}
