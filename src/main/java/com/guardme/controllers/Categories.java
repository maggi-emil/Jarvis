package com.guardme.controllers;

import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Categories {

    public static final String GETCATEGORIES = "v1/categories";

    public static ValidatableResponse get(){
        return given().spec(RequestSpecs.commonSpecs()).
                when().get(GETCATEGORIES).
                then();
    }
}
