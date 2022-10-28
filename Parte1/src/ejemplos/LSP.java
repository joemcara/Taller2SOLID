package ejemplos;
public class LSP {
    public interface Computadora{
        public void browse(String buscar);
    }

    public class ComputadoraEscritorio implements Computadora{
        @Override
        public void browse(String buscar){
            //abre navegador y busca algo en internet
        }
    }

    public class ComputadoraPortatil implements Computadora{
        @Override
        public void browse(String buscar){
            //abre navegador y busca algo en internet
        }
    }
    /*
     * Este metodo puede lanzar una excepcion porque si el objeto enviado 
     * es una computadora portatil y no está encendido 
     * el wifi no podrá buscar lo solicitado en internet, por lo que rompe
     * LSP
    */
    
    void browseSomething(Computadora compu, String buscar){
        compu.browse(buscar);
    }

    //SOLUCION
    /* 
     * La clase que lanzaba la excepcion debe manejar la situacion en la
     * dicho inconveniente sucede para que el comportamiento requerido
     * se ejecute independientemente de la clase que lo haga
     */
    
    public class ComputadoraPortatil implements Computadora{
        @Override
        public void browse(String buscar){
            if(!isWifiOn){
                turnWifiOn();
            }
            //abre el navegador y busca algo en internet
        }
    }

    /*
     * Ahora en el metodo siguiente, no importa que objeto se mande, no
     * generará ninguna excepcion
     *
     */
    
    void browseSomething2(Computadora compu, String buscar){
        compu.browse(buscar);
    }

}