package colecciones;

public class UsuarioTest {
	
	public static void main(String[] args) {
		
		UsuarioManager um = new UsuarioManager();
		
		while (true) {
			um.showUsuarios();
			um.fabricaUsuarios();
		}
	}
}
