package Prototype;
import java.util.ArrayList;

public abstract class GameScenario {

    protected String scenarioName;
    protected String scenarioDescription;
    protected String scenarioType;
    protected String scenarioBackground;
    protected ArrayList<String> RandomLocationsList = new ArrayList<>();
    
    public GameScenario(GameScenario gameScenario) {
        if (gameScenario != null) {
            this.scenarioName = gameScenario.scenarioName;
            this.scenarioDescription = gameScenario.scenarioDescription;
            this.scenarioType = gameScenario.scenarioType;
            this.scenarioBackground = gameScenario.scenarioBackground;
            this.RandomLocationsList = new ArrayList<>(gameScenario.RandomLocationsList);
        } else {
            this.scenarioName = "";
            this.scenarioDescription = "";
            this.scenarioType = "";
            this.scenarioBackground = "";
            this.RandomLocationsList = new ArrayList<>();
        }
    }
    public String getScenarioName() {
        return scenarioName;
    }
    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }
    public String getScenarioDescription() {
        return scenarioDescription;
    } 
    public void setScenarioDescription(String scenarioDescription) {
        this.scenarioDescription = scenarioDescription;
    }
    public String getScenarioType() {
        return scenarioType;
    }
    public void setScenarioType(String scenarioType) {
        this.scenarioType = scenarioType;
    }
    public String getScenarioBackground() {
        return scenarioBackground;
    }
    public void setScenarioBackground(String scenarioBackground) {
        this.scenarioBackground = scenarioBackground;
    }
    public void addWeaponsPosition(String location) {
        System.out.println("Adding weapons to " + location);
        RandomLocationsList.add(location);
    }
    public void deleteallWeapons() {
        if (RandomLocationsList.size() > 0) {
            System.out.println("Deleting all weapons");
            RandomLocationsList.clear();
        }
        else
            System.out.println("No weapons to delete");        
    }
    public abstract GameScenario clone();
}
