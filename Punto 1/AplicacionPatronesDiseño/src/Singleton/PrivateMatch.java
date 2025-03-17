package Singleton;

public class PrivateMatch {
    public static void main(String[] args) {
        // Obtener la instancia única del GameManager
        GameManager gameManager = GameManager.getInstance();

        Player paola = new Player("Paola", "1234");
        Player wilson = new Player("Wilson", "3214");
        Player yeison = new Player("Yeison", "0912");
        
        // Agregar jugadores a la partida privada
        gameManager.addPlayer(paola);
        gameManager.addPlayer(wilson);
        gameManager.addPlayer(yeison);
        
        // Iniciar la partida
        gameManager.startGame();

        //Desarrollo de la partida...
        gameManager.removePlayer(paola);
        
        // Finalizar la partida
        gameManager.endGame();
    }
}
