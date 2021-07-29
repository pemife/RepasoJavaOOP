package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsuarioManager {
	
	Map<String, String> usuarios = new HashMap<>();

	public void fabricaUsuarios() {
		Scanner sc = new Scanner(System.in);
		
		String respuesta;
		String userName;
		String password = null;
		
		System.out.printf("\n\nEscriba el userName de un nuevo usuario: ");
		userName = sc.nextLine();
		
		if (usuarios.containsKey(userName)) {
			System.out.println("El usuario ya existe, la contraseña se sobreescribirá");
		}
			
		System.out.printf("Escriba la contraseña para el usuario: ");
		password = sc.nextLine();
		
		System.out.printf("El nombre de usuario es %s y la contraseña %s\nEs correcto? Y/n: ", userName, password);
		respuesta = sc.nextLine();
		
		if (respuesta.equals("Y") || respuesta.equals("y") || respuesta.equals("")) {
			this.usuarios.put(userName, password);
		} else {
			System.out.println("Respuesta incorrecta ( " + respuesta + " )");
		}
		
	}
	
	public void showUsuarios() {
		System.out.println("Tabla de usuarios:");
		if (this.usuarios.isEmpty()) {
			System.out.println("No hay usuarios todavía!");
		} else {
			System.out.printf("\n%s%s|%s%s", "Usuario", this.insertarCaracteres(" ", 32 - "usuario".length()), this.insertarCaracteres(" ", 32 - "Contraseña".length()), "Contraseña");
			System.out.printf("\n%s|%s", this.insertarCaracteres("_", 32), this.insertarCaracteres("_",	32));
			for (String userName: this.usuarios.keySet()) {
				if ( userName.length() < 32 ) {
					System.out.printf("\n%s%s|%s%s", userName, this.insertarCaracteres(" ", 32 - userName.length()), this.insertarCaracteres(" ", 32 - this.usuarios.get(userName).length()), this.usuarios.get(userName));
				} else {
					System.out.printf("\n%s", userName.substring(0, 32) + "|");
					System.out.printf("\n%s%s|%s%s", userName.substring(32), this.insertarCaracteres(" ", 32 - userName.substring(32).length()), this.insertarCaracteres(" ", 32 - this.usuarios.get(userName).length()), this.usuarios.get(userName));
				}
			}
		}
	}
	
	private String insertarCaracteres(String caracter, int nEspacios) {
		
		String caracteres = "";
		
		while (nEspacios > 0) {
			caracteres += caracter;
			nEspacios--;
		}
		
		return caracteres;
	}
}
