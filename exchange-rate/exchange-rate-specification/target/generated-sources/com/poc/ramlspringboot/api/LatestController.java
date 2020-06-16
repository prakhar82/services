
package com.poc.ramlspringboot.api;

import com.poc.ramlspringboot.api.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * No description
 * (Generated with springmvc-raml-parser v.2.0.4)
 * 
 */
@RestController
@Validated
@RequestMapping(value = "api/latest", produces = "application/json")
public interface LatestController {


    /**
     * No description
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Response> getResponse();

}
