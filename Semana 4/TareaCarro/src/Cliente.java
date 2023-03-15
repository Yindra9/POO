import java.util.ArrayList;
//extender de la clase personas para saber de quie ereda
public class Cliente extends Personas{
    //atributos
    private ArrayList<Carro> carrosRepserados=new ArrayList<Carro>();//lista que se guarad los carros que se reparen
    private ArrayList<Carro> carrosComprados=new ArrayList<Carro>();
    //herredar el contructor
    public Cliente(){
        super();
    }
    //contructor herredado
    public Cliente(String cedula, String nombre, String apellido,
                   String telefono, String direccion, String correo) {
        super(cedula, nombre, apellido, telefono, direccion, correo);
        this.carrosRepserados = carrosRepserados;
        this.carrosComprados = carrosComprados;

    }
     public void Reservar(){

    }
    public void Comprar(){

    }
    public ArrayList<Carro> getCarrosRepserados() {
        return carrosRepserados;
    }

    public void setCarrosRepserados(ArrayList<Carro> carrosRepserados) {
        this.carrosRepserados = carrosRepserados;
    }

    public ArrayList<Carro> getCarrosComprados() {
        return carrosComprados;
    }

    public void setCarrosComprados(ArrayList<Carro> carrosComprados) {
        this.carrosComprados = carrosComprados;
    }
}
