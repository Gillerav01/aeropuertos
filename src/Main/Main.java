package Main;
import Main.Clases.*;
import java.util.Scanner;



public class Main {
    
    final static int numAeropuertos = 4;
    static Aeropuerto aeropuertos[] = new Aeropuerto[numAeropuertos];
         
    public static void main(String[] args) {
        insertarDatosAeropuerto(aeropuertos);
        menu();
    }
    
    public static void insertarDatosAeropuerto (Aeropuerto aero[]){
    
        aero[0] = new AeropuertoPublico(5000, "El Pepe", "Laredo", "España");
        System.out.println(aero[0].getNombre());
        aero[0].insertarCompañia(new Compañia("Aeroespaña"));
        aero[0].insertarCompañia(new Compañia("Cantabriavion"));
        aero[0].getCompañia("Aeroespaña").insertarVuelo(new Vuelo ("VAE001", "Laredo", "Santoña", 50.00, 50));
        aero[0].getCompañia("Aeroespaña").insertarVuelo(new Vuelo ("VAE002", "Laredo", "Santander", 100.00, 52));
        aero[0].getCompañia("Cantabriavion").insertarVuelo(new Vuelo("VCV001", "Laredo", "Santander", 300.00, 10));
        aero[0].getCompañia("Cantabriavion").insertarVuelo(new Vuelo("VCV002", "Laredo", "Santander", 500.00, 10));
        aero[0].getCompañia("Aeroespaña").getVuelo("VAE001").insertarPasajero(new Pasajero("Guillermo", "PSP31T", "Español"));
        aero[0].getCompañia("Aeroespaña").getVuelo("VAE002").insertarPasajero(new Pasajero("Pepe", "FD2ZX", "Español"));
        aero[0].getCompañia("Cantabriavion").getVuelo("VCV001").insertarPasajero(new Pasajero("Juan", "F0226T", "Español"));
        aero[0].getCompañia("Cantabriavion").getVuelo("VCV002").insertarPasajero(new Pasajero("Jon", "F3261FT", "Español"));

        aero[1] = new AeropuertoPrivado("La Pepa", "Madrid", "España");
        aero[1].insertarCompañia(new Compañia("Air-tor"));
        String empresas[] = {"Empresa1", "Empresa2"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].getCompañia("Air-tor").insertarVuelo(new Vuelo ("AE303", "Cancun", "Madrid", 300.00, 50));
        aero[1].getCompañia("Air-tor").getVuelo("AE303").insertarPasajero(new Pasajero ("Guillermo", "PSP31S", "Español"));
        
        aero[2] = new AeropuertoPublico (10000, "El Pepito", "Santander", "España");
        aero[2].insertarCompañia(new Compañia("Castra-vion"));
        aero[2].insertarCompañia(new Compañia ("Bryan-air"));
        aero[2].getCompañia("Castra-vion").insertarVuelo(new Vuelo ("VCV001", "Castro-Urdiales", "Santoña", 50.00, 100));
        aero[2].getCompañia("Castra-vion").insertarVuelo(new Vuelo ("VCV002", "Castro-Urdiales", "Laredo", 50.00, 100));
        aero[2].getCompañia("Bryan-air").insertarVuelo(new Vuelo ("VBA001", "Laredo", "Santander", 50.00, 1000));
        aero[2].getCompañia("Bryan-air").insertarVuelo(new Vuelo ("VBA002", "Perú", "Laredo", 500.00, 50));
        aero[2].getCompañia("Castra-vion").getVuelo("VCV001").insertarPasajero(new Pasajero("Ghuglielmo", "PSP31T", "Español"));
        aero[2].getCompañia("Castra-vion").getVuelo("VCV002").insertarPasajero(new Pasajero("Rim", "FD2ZX", "Español"));
        aero[2].getCompañia("Bryan-air").getVuelo("VBA001").insertarPasajero(new Pasajero("Alba", "FASD2", "Español"));
        aero[2].getCompañia("Bryan-air").getVuelo("VBA002").insertarPasajero(new Pasajero("Alberto", "FASDFZV", "Español"));
        
        
    }
    
    public static void menu(){
        Scanner in;
        int opcion = -1;
        do {
            System.out.println("\t Menú \n" + "1. Ver Aeropuertos gestionados. \n" +
                    "2. Visualizar empresas parocinadoras o subvenciones. \n" +
                    "3. Mostrar lista de compañias. \n" + 
                    "4. Lista de vuelos por compañía. \n" +
                    "5. Mostrar vuelos de Ciudad Origen a Ciudad Destino. \n" +
                    "6. Salir \n");
            
            
        } while (opcion != 6);
    };
    
}
