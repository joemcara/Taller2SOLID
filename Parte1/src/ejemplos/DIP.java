package ejemplos;
/*DIP -> Usamos una interfaz con computadora ya que asi evitamos estar sobrecargando varios constructores para
cada tipo de computadora. 
*/
interface Computadora{
    //metodos de pc
}

class Oficina{

    private String oficinaTipo;
    private Computadora pc;

    public Oficina(Computadora pc, String Oftipo){
        this.pc = pc;
        this.oficinaTipo = Oftipo;
    }
    
}
