package com.guardme.controllers;

import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Favourits {

    public static final String GETFAVOURITS = "v1/favourites/";

    public static ValidatableResponse getFavourits() {
        return given().spec(RequestSpecs.commonSpecs()).
                when().get(GETFAVOURITS).
                then();
    }

    public static ValidatableResponse getFavouritsID(Object id){
        return given().spec(RequestSpecs.commonSpecs()).
                pathParam("favourite_id", id).
                when().
                get(GETFAVOURITS + "{favourite_id}").
                then();

    }

}
