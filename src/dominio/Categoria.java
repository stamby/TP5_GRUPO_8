package dominio;

import java.util.ArrayList;

public class Categoria {
private String Nombre;

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
} 

public ArrayList<Categoria> Obtener(){ 
	Categoria cat1 = new Categoria(); 
	cat1.Nombre = "Terror"; 
	Categoria cat2 = new Categoria(); 
	cat2.Nombre = "Accion"; 
	Categoria cat3 = new Categoria(); 
	cat3.Nombre = "Suspenso"; 
	Categoria cat4 = new Categoria(); 
	cat4.Nombre = "Romantica"; 

	ArrayList<Categoria> lista = new ArrayList<Categoria>();
	lista.add(cat1);
	lista.add(cat2);
	lista.add(cat3);
	lista.add(cat4);
	return lista;
	
	
	
}

}
