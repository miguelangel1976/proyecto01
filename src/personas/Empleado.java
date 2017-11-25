package personas;

public class Empleado extends Persona{
	
	//Atributos
	String idPersonal;
	float sueldo;
	
	public String getIdPersonal() {
		return idPersonal;
	}
	
	public void setIdPersonal(String idPersonal) {
		this.idPersonal = idPersonal;
	}
	
	public float getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	//Constructor
	public Empleado() {
		super();
	}
	
	public Empleado(String pidPersonal, float psueldo)
	{	
		this.idPersonal = pidPersonal;
		this.sueldo = psueldo;
	}

	public Empleado(float psueldo, String pnombre) {
		super();
		this.sueldo = psueldo;
		this.setNombre(pnombre);
	}
	
	//Métodos
	 
	public void salidaDatos()
	{
		this.sobreescribir();
	}
	
}



