package sistema;
/*
 * 1. Class Notificacion viola el OCP -> porque si se añade un metodo de pago adicional 
 se tendrá que añadir otra condicion al if en el método notificar de Notificacion.
*/

public interface Notificacion {
    public void notificar();//notifica
    
}
