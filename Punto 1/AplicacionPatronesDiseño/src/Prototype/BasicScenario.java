package Prototype;
import java.util.ArrayList;
import java.util.List;

public class BasicScenario extends GameScenario{

    private List<String>  RandomLocationsList = new ArrayList<>();

    public BasicScenario(BasicScenario target) {
        super(target);
        if (target != null) {
            this.scenarioName = target.scenarioName;
            this.scenarioDescription = target.scenarioDescription;
            this.scenarioType = target.scenarioType;
            this.scenarioBackground = target.scenarioBackground;
            this.RandomLocationsList = new ArrayList<>(target.RandomLocationsList);
        } else {
            this.scenarioName = "";
            this.scenarioDescription = "";
            this.scenarioType = "";
            this.scenarioBackground = "";
            this.RandomLocationsList = new ArrayList<>();
        }
    }
    
    public BasicScenario clone() {
        return new BasicScenario(this);
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
}