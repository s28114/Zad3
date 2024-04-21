import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Goal> goals;

    public Manager(String firstName, String lastName, String address, String email, String pesel, int employmentYear) {
        super(firstName, lastName, address, email, pesel, employmentYear);
        goals = new ArrayList<>();
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }
}
