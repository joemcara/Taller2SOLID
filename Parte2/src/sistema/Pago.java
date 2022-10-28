package sistema;
/*
 * 2.  Class Pago viola el SRP -> porque posee metodos de calcular impuestos de factura y
       generar factura, cuando realmente solo debe realizar cobro y notificar cuando realiza dicho cobro.
       Es decir tiene responsabilidades que no le corresponden.
 */
public interface Pago {
    public void realizarCobro(double monto);
}
