public class Carrocia extends Reparacion{
    private String Problema;
    private String Solucion;

    public Carrocia(String fecha, String nombreMecanico, String matricula, String detalle, String precioR, String problema, String solucion) {
        super(fecha, nombreMecanico, matricula, detalle, precioR);
        Problema = problema;
        Solucion = solucion;
    }

    public String getProblema() {
        return Problema;
    }

    public void setProblema(String problema) {
        Problema = problema;
    }

    public String getSolucion() {
        return Solucion;
    }

    public void setSolucion(String solucion) {
        Solucion = solucion;
    }

    @Override
    public String toString() {
        return "Electricas{" +
                "Problema='" + Problema + '\'' +
                ", Solucion='" + Solucion + '\'' +
                "} " + super.toString();
    }
}
