package com.guardme.tests.categories;

import com.guardme.controllers.Categories;
import com.guardme.models.requests.categories.GetCategoriesResponse;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetCategories {

    @Test
    public void verify_That_GetCategories_Responds_With_200_StatusCode() {
        Categories.get().
                log().all().
                assertThat().
                statusCode(200);
    }

    @Test
    public void verify_That_GetCategories_Responds_With_Correct_Schema() {
        Categories.get().assertThat()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schemas/GetCategories.Json"));
    }

    @Test
    public void verify_That_GetCategories_Responds_With_correct_ID() {
        List<GetCategoriesResponse> getCategoriesList = Categories.
                get().
                extract().body().jsonPath().getList("", GetCategoriesResponse.class);

        GetCategoriesResponse firstCategory = getCategoriesList.get(0);
        Assert.assertEquals(firstCategory.getId(), 5);
        Assert.assertEquals(firstCategory.getName(), "boxes");

    }

}
