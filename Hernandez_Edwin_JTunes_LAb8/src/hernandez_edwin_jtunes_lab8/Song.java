package hernandez_edwin_jtunes_lab8;

public class Song {

    private int codigo;
    private String nombre;
    private double precio;
    private int sumaEstrellas;
    private int cantidadReviews;

    
    public Song(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.sumaEstrellas = 0;
        this.cantidadReviews = 0;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    
    public boolean addStars(int stars) {
        if (stars >= 0 && stars <= 5) {
            sumaEstrellas += stars;
            cantidadReviews++;
            return true;
        } else {
            return false;
        }
    }

    
    public double songRating() {
        if (cantidadReviews == 0) {
            return 0.0;
        }
        return (double) sumaEstrellas / cantidadReviews;
    }

    
    public void print() {
        String print=(codigo + " - " + nombre + " - " + precio + " - " + songRating());
    }
}
