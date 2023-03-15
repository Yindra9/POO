public class Mecanica extends Reparacion{
    private String problema;
    private String solucion;

    public Mecanica(String fecha, String nombreMecanico, String matricula, String detalle, String precioR, String problema, String solucion) {
        super(fecha, nombreMecanico, matricula, detalle, precioR);
        this.problema = problema;
        this.solucion = solucion;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    @Override
    public String toString() {
        return "Mecanica{" +
                "problema='" + problema + '\'' +
                ", solucion='" + solucion + '\'' +
                "} " + super.toString();
    }
}
