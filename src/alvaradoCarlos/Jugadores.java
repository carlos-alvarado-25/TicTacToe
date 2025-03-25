package alvaradoCarlos;

public class Jugadores {

    private char color;

    public Jugadores(char color) {
        this.color = color;
    }

    public void moverFicha(Tablero tablero) {
        Coordenada coordenada = new Coordenada();
        do {
            coordenada.seleccionar();
        } while(!coordenada.esValida() || tablero.estaVacio(coordenada));
        tablero.sacarFicha(coordenada);
        this.ponerFicha(tablero);
    }

    public char color() {
        return color;
    }

    public void ponerFicha(Tablero tablero) {
        Coordenada coordenada = new Coordenada();
        do { 
            coordenada.seleccionar();
        } while (!coordenada.esValida() || tablero.estaOcupada(coordenada) );
        tablero.ponerFicha(coordenada, color);
    }

    public void celebrar() {
        System.out.println("Felicidades has ganado el 3 en raya");
    }


}
