package observaPajaros;

import java.util.ArrayList;

public class PajaroBD {
 
    private ArrayList<Pajaro> pajaros;
 
    public PajaroBD() {
        pajaros = new ArrayList<Pajaro>();
    }
 
    public boolean observado(String nombre) {
        for (Pajaro pajaro : pajaros) {
            if (nombre.equals(pajaro.nombre())) {
                pajaro.observado();
                return true;
            }
        }
        return false;
    }
 
    public void addPajaro(String nombre, String nombreLatin) {
        pajaros.add(new Pajaro(nombre, nombreLatin));
    }
 
    public String muestraPajaro(String nombre) {
        for (Pajaro pajaro : pajaros) {
            if (nombre.equals(pajaro.nombre())) {
                return pajaro.toString();
            }
        }
        return null;
    }
 
    public String estadisticas() {
        String estadistica = "";
        for (Pajaro pajaro : pajaros) {
            estadistica = estadistica+pajaro.toString()+"\n";
        }
        return estadistica;
    }
 
}