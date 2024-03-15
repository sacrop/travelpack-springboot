public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int signedUpCount;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.signedUpCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSignedUpCount() {
        return signedUpCount;
    }

    public boolean signUp() {
        if (signedUpCount < capacity) {
            signedUpCount++;
            return true;
        }
        return false;
    }
}
