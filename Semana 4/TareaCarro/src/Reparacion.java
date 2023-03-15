public class Reparacion {
    private String fecha;
    private String nombreMecanico;
    private String matricula;
    private String detalle;
    private String precioR;
    //contructor por defecto
    public Reparacion(String fecha, String nombreMecanico, String matricula, String detalle, String precioR) {
        this.fecha = fecha;
        this.nombreMecanico = nombreMecanico;
        this.matricula = matricula;
        this.detalle = detalle;
        this.precioR = precioR;
    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "fecha='" + fecha + '\'' +
                ", nombreMecanico='" + nombreMecanico + '\'' +
                ", matricula='" + matricula + '\'' +
                ", detalle='" + detalle + '\'' +
                ", precioR='" + precioR + '\'' +
                '}';
    }

    //get y set del contructor
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getNombreMecanico() {
        return nombreMecanico;
    }

    public void setNombreMecanico(String nombreMecanico) {
        this.nombreMecanico = nombreMecanico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getPrecioR() {
        return precioR;
    }

    public void setPrecioR(String precioR) {
        this.precioR = precioR;
    }
}
