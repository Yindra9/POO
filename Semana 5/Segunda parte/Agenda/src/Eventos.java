public class Eventos {
    private String dia;
    private String hora;
    private String direcion;

    public Eventos(String dia, String hora, String direcion) {
        this.dia = dia;
        this.hora = hora;
        this.direcion = direcion;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    @Override
    public String toString() {
        return "dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", direcion='" + direcion + '\'';
    }
}
