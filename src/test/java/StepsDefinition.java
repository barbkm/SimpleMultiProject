import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;


public class StepsDefinition {

    public StepsDefinition() {
    }

    @Given("All information needed for bands analysis are present")
    public void validateInputs(){
        String.format("All needed inputs are present.");

    }
}
