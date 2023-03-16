public class ContandoAmigos extends Contando{
    private String Sobrenombre;

    public ContandoAmigos(String nombre, int edad, String direccion, String sobrenombre) {
        super(nombre, edad, direccion);
        Sobrenombre = sobrenombre;
    }

    public String getSobrenombre() {
        return Sobrenombre;
    }

    public void setSobrenombre(String sobrenombre) {
        Sobrenombre = sobrenombre;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Sobrenombre='" + Sobrenombre + '\'';
    }
}
