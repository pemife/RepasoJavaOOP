package repaso;

public class PersonaTest {
	
	public static void main(String[] args) {
		Persona persona = new Persona();
		Persona persona2 = new Persona();
		
		persona.walk(5);
		persona.walk(20);
		persona.sleep();
		
		persona2.walk(5);
		persona2.walk(20);
		persona2.sleep();
	}
}
