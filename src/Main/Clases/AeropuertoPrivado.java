package Main.Clases;

public class AeropuertoPrivado extends Aeropuerto{
    private String listaEmpresas[];
    private int numEmpresa;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String empresas[]) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas = empresas;
        this.numEmpresa = empresas.length;
    }
    
    public void insertarEmpresas (String e[]) {
        this.listaEmpresas = e;
        this.numEmpresa = e.length;
    }
    
    public void insertarEmpresa (String empresa) {
        listaEmpresas[numEmpresa] = empresa;
        numEmpresa++;
    }

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }
    
    
    
}
