package Prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SetupScenario {
    public static void main(String[] args) {
        
        int matchNumbers = 4; //Se define el número de partidas a lanzar al servidor

        //Localizaciones 
        ArrayList<String> arrayScenarios = new ArrayList<>(Arrays.asList("house", "school", "park", "beach", 
        "forest", "mountain", "lake", "river", "cave", "desert", "jungle", "swamp", "city", "town", "village"));

        ArrayList<Object> arrayGameScenarios = new ArrayList<>();

        //Creación de un scenario base a cargar
        GameScenario gameScenarioBase = new BasicScenario(null);
        gameScenarioBase.setScenarioName("Basic");
        gameScenarioBase.setScenarioDescription("A basic scenario for testing");
        gameScenarioBase.setScenarioType("Test");
        gameScenarioBase.setScenarioBackground("A blank background");
        
        //Crear el número de mapas según las partidas
        for (int i = 0; i < matchNumbers; i++) {
            GameScenario protoGameScenario = gameScenarioBase.clone(); //Clonar el scenario
            String NameProtoScenario = protoGameScenario.getScenarioName(); //Obtener el nombre del scenario base
            protoGameScenario.setScenarioName(NameProtoScenario+"_"+ Integer.toString(i)); //Setear el nuevo nombre del scenario
            Random random = new Random();
            protoGameScenario.addWeaponsPosition(arrayScenarios.get(random.nextInt(arrayScenarios.size()))); //Añadir armas al scenario
            
            System.out.println("Adding scenario: "+protoGameScenario.getScenarioName() + " to list.");
            arrayGameScenarios.add(protoGameScenario);
        }
        
        //Send to game scenarios to the server logic ...
    }
}
