package com.guardme.tests.breeds;

import com.guardme.controllers.Breeds;
import com.guardme.models.requests.Breeds.SearchBreedsResponse;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.module.jsv.JsonSchemaValidator;

import java.util.List;

public class SearchBreeds {


    @Test
    public void verifyThat_Search_Breeds_Responds_With_200_StatusCode() {
        Breeds.search("air", "1").
                log().all().
                assertThat().statusCode(200);
    }

    @Test
    public void verifyThat_SearchBreeds_Responds_With_Correct_Schema() {
        Breeds.search("air", "1").assertThat().
               body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schemas/SearchBreads.Json"));
    }

    @Test
    public void verify_That_SearchBreeds_Responds_With_Correct_Origion() {

        List<SearchBreedsResponse> searchBreedsResponseList = Breeds.
                search("air", "1").extract().body().jsonPath().getList("", SearchBreedsResponse.class);

        SearchBreedsResponse firstBreed = searchBreedsResponseList.get(0);

        Assert.assertEquals(firstBreed.getOrigin(), "Egypt");
    }
}
