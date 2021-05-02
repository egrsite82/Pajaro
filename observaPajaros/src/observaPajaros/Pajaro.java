package observaPajaros;

public class Pajaro {
	 
    private String nombre;
    private String nombreLatin;
    private int observaciones;
 
    public Pajaro(String nombre, String nombreLatin) {
        this.nombre = nombre;
        this.nombreLatin = nombreLatin;
        this.observaciones = 0;
    }
 
    public String nombre() {
        return this.nombre;
    }
 
    public void observado() {
        this.observaciones++;
    }
 
    public String toString() {
        return this.nombre+" ("+this.nombreLatin+"): "+this.observaciones+" observaciones";
    }
 
}