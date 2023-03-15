//13/03/2023
//objectivo:Crear una clases
public class Carro {
    private String marca;
    private String modelo;
    private String matricula;
    private int ano;
    private int preciov;
    private int precioc;
    private String tipo;
    private String exposicion;
    //contrudor por defecto
    public Carro(){}
    public Carro(String marca,String modelo,String matricula,int ano,int preciov,int precioc,String tipo){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setMatricula(matricula);
        this.setAno(ano);
        this.setPreciov(preciov);
        this.setPrecioc(precioc);
        this.setTipo(tipo);
        this.setExposicion(exposicion);
    }
//get y set del contructor


    public String getExposicion() {
        return exposicion;
    }

    public void setExposicion(String exposicion) {
        this.exposicion = exposicion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPreciov() {
        return preciov;
    }

    public void setPreciov(int preciov) {
        this.preciov = preciov;
    }

    public int getPrecioc() {
        return precioc;
    }

    public void setPrecioc(int precioc) {
        this.precioc = precioc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
///otar afarma de impremir los datos
    @Override
    public String toString(){
        return "Carro{"+ "Marca = "
                + this.getMarca() +", modelo= "
                + this.getModelo()+", precio de compra= "
                + this.getPrecioc()+ ", precio de venta= "
                + this.getPreciov()+ ", matricula= "
                + this.getMatricula()+", tipo= "
                + this.getTipo()+", lugar de exposicion"
                + this.getExposicion()+ '}';

    }
}
