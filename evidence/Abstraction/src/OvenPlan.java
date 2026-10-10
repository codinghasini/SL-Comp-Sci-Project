import java.util.Arrays;
import java.util.List;

public class OvenPlan extends CookingPlan {

    public OvenPlan(String dishName) {
        super(dishName);
    }

    @Override
    public List<String> cook() {
        return Arrays.asList(
                "Prepare the oven and baking dish.",
                "Place " + dishName + " in the baking dish.",
                "Bake using the recipe's oven instructions."
        );
    }
}