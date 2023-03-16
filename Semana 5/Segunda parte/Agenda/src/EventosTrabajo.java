public class EventosTrabajo extends Eventos{
    private String Documentos;

    public EventosTrabajo(String dia, String hora, String direcion, String documentos) {
        super(dia, hora, direcion);
        Documentos = documentos;
    }

    public String getDocumentos() {
        return Documentos;
    }

    public void setDocumentos(String documentos) {
        Documentos = documentos;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", Documentos='" + Documentos + '\'';
    }
}
