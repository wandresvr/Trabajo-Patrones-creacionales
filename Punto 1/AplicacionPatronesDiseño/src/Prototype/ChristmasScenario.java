package Prototype;

public class ChristmasScenario extends GameScenario{

    public ChristmasScenario(ChristmasScenario target) {
        super(target);
        this.scenarioName = "Christmas";
        this.scenarioDescription = "A festive scenario for Christmas";
        this.scenarioType = "Festive";
        this.scenarioBackground = "A snowy winter wonderland";
    }

    public ChristmasScenario clone() {
        return new ChristmasScenario(this);
    }
}
