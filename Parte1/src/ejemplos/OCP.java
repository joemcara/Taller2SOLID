package ejemplos;

import java.util.List;

/*
 * OCP
 * En este ejemplo se tenia un método guardar por cada tipo de objeto
 * y se lo almacenada en listas separadas Ropas, Relojes y Sombreros.
 * Entonces si se agregaban más tipos de articulos se tenia que modificar 
 * la clase. Para solucionarlo se crea una interfaz articulo y se la 
 * implementa en cada tipo.
 */

class  Inventario{
	private List<Articulo> articulos;
	
	public void guardar(Articulo articulo) {
		//Guarda un nuevo articulo al inventario
	}
}

interface Articulo{
	double getPrecio();
}

class Ropa implements Articulo{
	private double precio;
	
	public double getPrecio(){
		return precio;
	}
}

class Reloj implements Articulo{
	private double precio;
	
	public double getPrecio(){
		return precio;
	}
}

class Sombrero implements Articulo{
	private double precio;

	@Override
	public double getPrecio() {
		return precio;
	}
}