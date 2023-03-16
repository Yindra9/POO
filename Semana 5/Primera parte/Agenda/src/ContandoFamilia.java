public class ContandoFamilia extends Contando {
    private String tiposangre;

    public ContandoFamilia(Persona persona, String direccion, String tiposangre) {
        super(persona, direccion);
        this.tiposangre = tiposangre;
    }

    public ContandoFamilia(String nombre, int edad, String direccion, String tiposangre) {
        super(nombre, edad, direccion);
        this.tiposangre = tiposangre;
    }

    public String getTiposangre() {
        return tiposangre;
    }

    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", tiposangre='" + tiposangre + '\'';
    }
}
