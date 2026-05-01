package GymTracker.nutritionv1.Model;

public enum RoutineStatus {

    BREAKFAST("Café da manhã"),
    LUNCH("Almoço"),
    AFTERNOON_SNACK("Café da tarde"),
    DINNER("Jantar");

    private final String description;

    RoutineStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
