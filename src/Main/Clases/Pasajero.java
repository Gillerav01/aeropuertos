package Main.Clases;

public class Pasajero {
    
    private String nombre;
    private String pasaporte;
    private String nacionalidad;

    public Pasajero(String nombre, String pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public String getPasaporte(){
        return pasaporte;
    }

    @Override
    public String toString() {
        return "El nombre del pasajero es " + nombre + ", su pasaporte es " + pasaporte + " y la nacionalidad es " + nacionalidad;
    }
    
    
    
}
