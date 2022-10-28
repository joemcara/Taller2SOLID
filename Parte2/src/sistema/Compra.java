package sistema;
/*
 * 4. Class Compra viola DIP -> porque tiene constructores para cada tipo de pago,
dependiendo asi de las clases de tipo pago que se creen y no de una interfaz que
generalice todos estos tipos. 
 * 
 */
public class Compra{
    private Pago pago;
    private List articulos;
    // Solucion al 4. 
    public Compra (Pago pago){
        //inicializaciones
    }
    public void agregarArticulo(Articulo articulo){
        //agregar un articulo a la compra
    }

    public void removerArticulo(Articulo articulo){
        //remover un articulo
    }
