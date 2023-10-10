package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;

public class UserSteps {

    @Steps
    Get get;

    @Given("I set GET endpoints")
    public void setGetApiEndpoint(){
        get.setApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void sendGetRequest(){
        get.sendGetRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void validateResponseCode200(){
        get.validateResponseCode200();
    }

    @And("I receive all post data")
    public void validateAllPostDate(){
        get.validateAllPostDate();
    }

    @Given("I set another GET endpoint")
    public void setAnotherApiEndpoints(){get.setAnotherApiEndpoints();
    }

    @When("I send GET method")
    public void sendGetMethod(){get.sendGetMethod();
    }

    @And("I receive a specific post data by ID")
    public void validateSpecificPostData(){get.validateSpecificPostData();
    }
}
