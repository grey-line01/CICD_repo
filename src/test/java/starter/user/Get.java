package starter.user;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

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

    @Step("I set another GET endpoint")
    public String setAnotherApiEndpoints(){
        return url + "posts/1";

    }

    @Step("I send GET method")
    public void sendGetMethod(){
        SerenityRest.given()
                .when()
                .get(setAnotherApiEndpoints());

    }

    @Step("I receive a specific post data by ID")
    public void validateSpecificPostData(){

        restAssuredThat(response -> response.body("userId", equalTo(1)));
        restAssuredThat(response -> response.body("id", equalTo(1)));
        restAssuredThat(response -> response.body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
        restAssuredThat(response -> response.body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")));

    }
}
