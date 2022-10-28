package sistema;

/*
 * 4. Class Compra viola DIP -> porque tiene constructores para cada tipo de pago, 
dependiendo asi de las clases de tipo pago que se creen y no de una interfaz que generalice todos estos
tipos. 
 * 
 */

public class PagoPaypal implements Pago, Notificacion {
    private boolean loggedIn;
    @Override
    public void notificar() { 
        //enviarEmail();
    }
    @Override
    public void realizarCobro(double monto) {
        if(!loggedIn){
            //loguearse en la cuenta
        }    
        //cargar el monto de compra al medio de pago
    }
    
}
