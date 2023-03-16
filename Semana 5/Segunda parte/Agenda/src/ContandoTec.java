public class ContandoTec extends Contando{
    private String correo;

    public ContandoTec(Persona persona, String direccion, String correo) {
        super(persona, direccion);
        this.correo = correo;
    }

    public ContandoTec(String nombre, int edad, String direccion, String correo) {
        super(nombre, edad, direccion);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;

    }

    @Override
    public String toString() {
        return super.toString()+", correo='" + correo + '\'' ;

    }
}
