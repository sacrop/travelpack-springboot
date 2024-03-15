import java.util.ArrayList;
import java.util.List;

public class Passenger implements ActivitySignUp {

    private String name;
    private int passengerNumber;
    private PassengerType passengerType;
    private double balance;
    private List<Activity> signedActivities;

    public Passenger(String name, int passengerNumber, PassengerType passengerType, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        this.signedActivities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public double getBalance() {
        return balance;
    }

    public List<Activity> getSignedActivities() {
        return signedActivities;
    }

    private void signUpForStandard(Activity activity) {
        if (balance >= activity.getCost()) {
            balance -= activity.getCost();
            signedActivities.add(activity);
            activity.signUp();
        }
    }

    private void signUpForGold(Activity activity) {
        double discountedCost = activity.getCost() * 0.9;
        if (balance >= discountedCost) {
            balance -= discountedCost;
            signedActivities.add(activity);
            activity.signUp();
        }
    }

    private void signUpForPremium(Activity activity) {
        signedActivities.add(activity);
        activity.signUp();
    }

    @Override
    public void signUpforActivity(Activity activity) {
        if (passengerType == PassengerType.STANDARD) {
            signUpForStandard(activity);
        } else if (passengerType == PassengerType.GOLD) {
            signUpForGold(activity);
        } else if (passengerType == PassengerType.PREMIUM) {
            signUpForPremium(activity);
        }
    }
    
}
