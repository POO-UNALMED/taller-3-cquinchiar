package taller3.televisores;

public class Marca {
	private String nombre;
	
	public Marca (String Nom) {
		setNombre(Nom);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
}
