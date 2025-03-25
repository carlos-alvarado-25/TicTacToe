package alvaradoCarlos;

public class TresEnRaya {

    private Tablero tablero;
    private Jugadores[] jugador;
    private Turno turno;

    public TresEnRaya(){
        tablero = new Tablero();
        jugador = new Jugadores[2];
        jugador[0] = new Jugadores('x');
        jugador[1] = new Jugadores('o');
        turno = new Turno();
    }

    public void jugar() {
        do { 
            tablero.mostrar();
            if (!tablero.estaCompleto(jugador[turno.leToca()])){
                jugador[turno.leToca()].ponerFicha(tablero);
            } else {
                jugador[turno.leToca()].moverFicha(tablero);
            }
            turno.cambiar();
        } while (!tablero.hayTresEnRaya());
        jugador[turno.leToca()].celebrar();
    }

}
