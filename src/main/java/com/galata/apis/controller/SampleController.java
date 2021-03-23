package com.galata.apis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by girija-4135 on 22/03/21
 */

/**
 * Reference to write CRUD api :
 *  https://howtodoinjava.com/spring-rest/spring-rest-crud-jpa-example/
 *
 */
@RestController
@RequestMapping(value = "/example")
public class SampleController {
    @RequestMapping(method = RequestMethod.GET)
    public String get(){
        return "hello from SPRING!!!";
    }

}
