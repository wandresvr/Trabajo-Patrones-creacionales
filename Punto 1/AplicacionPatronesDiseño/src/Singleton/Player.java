package Singleton;

public class Player {
    private String name;
    private String id;

    public Player(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
}