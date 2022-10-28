package sistema;

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
