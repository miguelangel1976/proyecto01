package personas;

public class Persona {
	
	// Atributos de la Clase
	private String nombre;
	private byte edad;
	private char sexo;
	private String dni;
	private boolean bCasado;
	

	//Constructores
	public Persona() {
		super();
		this.nombre = "Anónimo";
		this.edad = 18;}

	public Persona(String nombre, byte edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public byte getEdad() {
		return edad;
	}

	
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	
	public boolean isbCasado() {
		return bCasado;
	}
	
	public void setbCasado(boolean bCasado) {
		this.bCasado = bCasado;
	}

	// Metodos
	
	public void sobreescribir()
	{
		System.out.print("Nombre: " + this.getNombre());
		System.out.print("Edad: " + this.getEdad());
		System.out.print("Sexo: " + this.getSexo());
		System.out.print("DNI: " + this.getDni());
		System.out.println("Casado: " + this.isbCasado());
	}
	
}




























