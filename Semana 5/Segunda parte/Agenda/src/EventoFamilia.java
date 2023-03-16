public class EventoFamilia extends Eventos{
    private String regalo;

    public EventoFamilia(String dia, String hora, String direcion, String regalo) {
        super(dia, hora, direcion);
        this.regalo = regalo;
    }

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", regalo='" + regalo + '\'';
    }
}
