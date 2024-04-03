package com.guardme.controllers;

import com.guardme.utilities.PropertiesReader;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecs {

    public static RequestSpecification commonSpecs(){
        return new RequestSpecBuilder().log(LogDetail.ALL).
                setBaseUri(PropertiesReader.readProperty("App_URL")).
                setContentType(ContentType.JSON).
                addHeader("x-api-key","17d94b92-754f-46eb-99a0-65be65b5d18f").
                addFilter(new AllureRestAssured()).
                build();
    }


}
