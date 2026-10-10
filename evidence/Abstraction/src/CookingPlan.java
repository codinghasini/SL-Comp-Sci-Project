import java.util.List;

public abstract class CookingPlan {
    protected String dishName;

    public CookingPlan(String dishName) {
        if (dishName == null || dishName.trim().isEmpty()) {
            throw new IllegalArgumentException("Dish name cannot be empty");
        }
        this.dishName = dishName;
    }

    public String getDishName() {
        return dishName;
    }

    public abstract List<String> cook();
}