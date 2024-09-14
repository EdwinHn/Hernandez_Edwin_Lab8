package hernandez_edwin_jtunes_lab8;

public class Jtunes {
    
    private Song[] canciones;
    private int capacidad;

    public Jtunes(int capacidad) {
        this.capacidad = capacidad;
        canciones = new Song[capacidad];
    }



   public boolean addSong(int codigo, String nombre, double precio) {
        if (searchSong(codigo) != null) {
            return false;
        }

        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] == null) {
                canciones[i] = new Song(codigo, nombre, precio);
                return true;
            }
        }

        return false;
    }

   
   
    public Song searchSong(int codigo) {
        for (Song song : canciones) {
            if (song != null && song.getCodigo() == codigo) {
                return song;
            }
        }
        return null;
    }

 
    
    public void rateSong(int codigo, int stars) {
        Song song = searchSong(codigo);
        if (song != null) {
            if (song.addStars(stars)) {
                System.out.println("Estrellas añadidas con éxito.");
                song.print();
            } else {
                System.out.println("Las estrellas deben estar entre 0 y 5.");
            }
        } else {
            System.out.println("Canción no encontrada.");
        }
    }

 
    
    public void printSongs() {
        for (Song song : canciones) {
            if (song != null) {
                song.print();
            }
        }
    }
}
