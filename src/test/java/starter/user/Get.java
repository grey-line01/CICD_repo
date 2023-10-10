package starter.user;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET endpoints")
    public String setApiEndpoints(){
        return url + "posts";

    }

    @Step("I send GET HTTP request")
    public void sendGetRequest(){
        SerenityRest.given()
                .when()
                .get(setApiEndpoints());

    }

    @Step("I receive valid HTTP response code 200")
    public void validateResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I receive all post data")
    public void validateAllPostDate(){
        String responseBody = SerenityRest.then().extract().asString();
        System.out.println("Response Body:\n" + responseBody);
    }
}
