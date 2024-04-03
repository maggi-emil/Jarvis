package com.guardme.tests.favourits;

import com.guardme.controllers.Favourits;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class GetFavourits {

    @Test
    public void verify_That_GetFavourits_Responds_With_200_StatusCode() {
        Favourits.getFavourits()
                .log().all().
                assertThat().
                statusCode(200);
    }
    @Test
    public void verify_That_GetFavouritsID_Responds_With_200_StatusCode() {
        Favourits.getFavouritsID(232347059).
                log().all().
                assertThat().
                statusCode(200);

    }



    }
