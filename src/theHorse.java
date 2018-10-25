public class theHorse implements Horse  {
    private String name;
    private int weight;
    public theHorse(String name,int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }
}
