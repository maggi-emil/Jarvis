package com.guardme.controllers;

import com.guardme.utilities.PropertiesReader;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecs {

//    public static RequestSpecification commonSpecs() {
//        return new RequestSpecBuilder()
//                .setContentType(ContentType.JSON)
//                .setAccept(ContentType.JSON)
//                .setBaseUri(PropertiesReader.readProperty("App_URL"))
//                .addFilter(new AllureRestAssured())
//                .build();
//    }

    public static RequestSpecification commonSpecs(){
        return new RequestSpecBuilder().
                setBaseUri(PropertiesReader.readProperty("App_URL")).
                setContentType(ContentType.JSON).
                addFilter(new AllureRestAssured()).
                build();
    }
}
