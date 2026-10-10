import java.util.Arrays;
import java.util.List;

public class CampingPlan extends CookingPlan {

    public CampingPlan(String dishName) {
        super(dishName);
    }

    @Override
    public List<String> cook() {
        return Arrays.asList(
                "Prepare the portable stove and camping pot.",
                "Place " + dishName + " in the camping pot.",
                "Cook using the recipe's portable-stove instructions."
        );
    }
}