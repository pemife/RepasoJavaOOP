package jerarquia;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		Arania arania = new Arania();
		Ave pinguino = new Pinguino();
		//Animal murcielago = new Murcielago();		// Error, murcielago no puede volar porque no contiene la funcion
		Murcielago murcielago = new Murcielago();
		Pez pez = new Pez();
		
		// Función propia de todos los Animales
		persona.setName("Ron Weasly");
		arania.setName("Aragog");
		pinguino.setName("Pingu");
		murcielago.setName("Batman");
		pez.setName("Dory");
		
//		System.out.println(arania + " - " + arania.getnHuevos());
//		arania.ponerHuevo();
//		System.out.println(arania + " - " + arania.getnHuevos());
		
		// Función propia de los Ovíparos
		// persona.incubar();	// Error
		arania.incubar();
		pinguino.incubar();
		//murcielago.incubar();	// Error
		pez.incubar();

		// Función propia de los Voladores
		//persona.volar();			// Error
		//arania.volar();			// Error
		//pinguino.volar();			// Error
		murcielago.volar();
		//pez.volar();				// Error
		
		// Función propia de los Mamíferos
		persona.amamantar();
		//arania.amamantar();		// Error
		//pinguino.amamantar();		// Error
		murcielago.amamantar();
		//pez.amamantar();			// Error
	}
}
