public class VendedorComi extends Personas{
 private int comision;

    public VendedorComi(int comision) {
        this.comision = comision;
    }

    public VendedorComi(String cedula, String nombre, String apellido, String telefono, String direccion, String correo, int comision) {
        super(cedula, nombre, apellido, telefono, direccion, correo);
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "VendedorComi{" +
                "comision=" + comision +
                "} " + super.toString();
    }
}
