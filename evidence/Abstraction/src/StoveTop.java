import java.util.Arrays;
import java.util.List;

public class StovetopPlan extends CookingPlan {

    public StovetopPlan(String dishName) {
        super(dishName);
    }

    @Override
    public List<String> cook() {
        return Arrays.asList(
                "Prepare the stovetop and pan.",
                "Place " + dishName + " in the pan.",
                "Cook using the recipe's stovetop instructions."
        );
    }
}