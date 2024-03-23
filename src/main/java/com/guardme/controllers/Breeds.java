package com.guardme.controllers;

import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Breeds {


    private  static final String BREADS_SEARCH= "v1/breeds";
    private  static final String BREADS_LIST= "v1/breeds/search";

    public static ValidatableResponse search (Object q, Object attachImage){
        return  given().spec(RequestSpecs.commonSpecs()).
                queryParams("q", q).
                queryParam("attach_image", attachImage).
                when().get(BREADS_SEARCH).
                then();
    }
}
