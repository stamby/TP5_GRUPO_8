package dominio;

public class Pelicula {
	public static int getId() {
		return Id;
	}
	public static void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Categoria getCat() {
		return cat;
	}
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	private static int Id; 
	private String Nombre; 
	private Categoria cat; 
}