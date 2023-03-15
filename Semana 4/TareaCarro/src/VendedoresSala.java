public class VendedoresSala extends Personas {
 private int Salario;

    public VendedoresSala(int salario) {
        Salario = salario;
    }

    public VendedoresSala(String cedula, String nombre, String apellido, String telefono, String direccion, String correo, int salario) {
        super(cedula, nombre, apellido, telefono, direccion, correo);
        Salario = salario;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return "VendedoresSala{" +
                "Salario=" + Salario +
                "} " + super.toString();
    }
}
