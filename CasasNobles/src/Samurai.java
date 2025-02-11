public class Samurai extends Personaje implements Accion {


    public Samurai(String nombre, String oficio, String arma) {
        super(nombre, oficio, arma);
    }

    @Override
    public void accion() {
        System.out.println(getNombre()+" es un "+getOficio()+" muy prestigioso  y lleva siempre su "+getArma());
    }
}
