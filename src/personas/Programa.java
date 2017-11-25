package personas;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Miguel",(byte) 35);

		System.out.println("Visualización de los datos de cada una de las Personas:");
		System.out.println("Persona 1.  Nombre: " + persona1.getNombre() + "  Edad: " + persona1.getEdad());
		System.out.println("Persona 2.  Nombre: " + persona2.getNombre() + "  Edad: " + persona2.getEdad());		
	}
}



