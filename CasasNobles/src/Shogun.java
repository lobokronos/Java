public class Shogun extends Personaje implements Accion{
    public Shogun(String nombre, String oficio, String arma) {
        super(nombre, oficio, arma);
    }

    @Override
    public void accion() {
        System.out.println(getNombre()+" es el gran "+getOficio()+", cuya familia ha reinado durante años las tierras de Japon ");
    }
}
