public class Ninja extends Personaje implements Accion{
    public Ninja(String nombre, String oficio,String arma) {
        super(nombre, oficio,arma);
    }

    @Override
    public void accion() {
        System.out.println(getNombre()+" es un "+getOficio()+" y lleva un "+getArma());
    }
}
