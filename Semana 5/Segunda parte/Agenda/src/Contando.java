public class Contando{
    private Persona persona;
    private String direccion;

    public Contando(Persona persona, String direccion) {
        this.persona = persona;
        this.direccion = direccion;
    }
    public Contando(String nombre, int edad, String direccion){
        this.persona = new Persona(nombre,edad);
        this.direccion = direccion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return  persona +
                ", direccion='" + direccion + '\''
                ;
    }
}
