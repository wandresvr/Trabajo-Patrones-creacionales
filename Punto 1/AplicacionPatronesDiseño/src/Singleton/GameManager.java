package Singleton;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    // Instancia única (singleton)
    private static GameManager instance;
    
    // Lista de jugadores y estado de la partida
    private List<Player> players;
    private boolean gameStarted;
    
    // Constructor privado evita instanciación externa
    private GameManager() {
        players = new ArrayList<>();
        gameStarted = false;
    }
    
    // Método sincronizado para obtener la instancia única
    public static synchronized GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        System.out.println("Instancia: "+instance);
        return instance;
    }
    
    // Agregar un jugador a la partida (antes de iniciar)
    public void addPlayer(Player player) {
        if (!gameStarted) {
            players.add(player);
            System.out.println("Jugador " + player.getName() + " se ha unido a la partida privada.");
        } else {
            System.out.println("No se puede agregar " + player.getName() + ". La partida ya ha comenzado.");
        }
    }

    //Banear un jugador
    public void removePlayer(Player player) {
        players.remove(player);
        System.out.println(player.getName() + " ha salido de la partida.");
    }
    
    // Iniciar la partida (requiere al menos 2 jugadores)
    public void startGame() {
        if (players.size() < 2) {
            System.out.println("No hay suficientes jugadores para iniciar la partida.");
        } else {
            gameStarted = true;
            System.out.println("La partida privada ha comenzado con los siguientes jugadores:");
            for (Player player : players) {
                System.out.println(" - " + player.getName());
            }
        }
    }
    
    // Finalizar la partida
    public void endGame() {
        System.out.println("Partida finalizada.");
        resetInstance();  // Reinicia el Singleton
    }

    private static void resetInstance() {
        System.out.println("Reiniciando la partida...");
        instance = null;
    }
}