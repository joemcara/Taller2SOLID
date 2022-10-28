package ejemplos;

/*
Aqui se aplica el SRP -> ya que los metodos de guardar y sacar el carro 
se los realiza en una clase aparte para que esta solo tenga esa responsabilidad y
la clase carro no tenga ningun metodo que no sea del carro como tal
*/
class Carro{

    String tipoCarro;
    public Carro(String tipo){
        this.tipoCarro = tipo;
    }

    public String getTipo(){
        return tipoCarro;
    }

}

class Garaje{
    void guardarCarro(Carro carro){
        //guarda el caro
    }

    void sacarCaro(Carro carro){
        //saca el carro del garaje
    }
}