public class Coche {

    private String modelo;
    private String matricula;
    private int cv;
    private int velocidad;
    private double km;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getCv() {
        return cv;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public double getKm() {
        return km;
    }
    public void setKm(double km) {
        this.km = km;
    }

    public Coche() {
    }

    public Coche(String modelo, String matricula, int cv) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }


    public void acelerar (int VelocidadAcelerar){

        if (this.velocidad>180){
            velocidad=180;
            System.out.println(this.modelo+": Velocidad máxima alcanzada");

        }else{
            this.velocidad+=VelocidadAcelerar;
            km+=  velocidad * (cv *(int) (Math.random()*10+1));
        }
    }

public void frenar (int VelocidadFrenar){

        if(velocidad<=0){
            velocidad=0;
            System.out.println("Velocidad mínima alcanzada");
        }else{
            velocidad-=VelocidadFrenar;
        }
}

public void parar(){
        velocidad=0;
}
public void resetear(){
        km=0;
}

public String mostrarDatos(){

     return "El "+this.modelo+" con matrícula "+this.matricula+" va a "+this.velocidad+" Km/h y lleva recorridos "+this.km+" Km";
}
}