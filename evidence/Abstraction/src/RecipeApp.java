
import java.util.Arrays;
import java.util.List;

public class RecipeApp {

    public void showPlan(CookingPlan plan) {
        System.out.println(plan.getDishName());

        for (String instruction : plan.cook()) {
            System.out.println(instruction);
        }
    }

    public static void main(String[] args) {
        RecipeApp app = new RecipeApp();

        List<CookingPlan> plans = Arrays.asList(
                new OvenPlan("Demo Dish"),
                new StovetopPlan("Demo Dish"),
                new CampingPlan("Demo Dish")
        );

        for (CookingPlan plan : plans) {
            app.showPlan(plan);
            System.out.println();
        }
    }
}