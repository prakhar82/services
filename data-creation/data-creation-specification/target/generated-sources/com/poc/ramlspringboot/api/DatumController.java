
package com.poc.ramlspringboot.api;

import javax.validation.Valid;
import com.poc.ramlspringboot.api.model.CreateDataRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping(value = "api/data", produces = "application/json")
public interface DatumController {


    /**
     * No description
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> createCreateDataRequest(
        @Valid
        @RequestBody
        CreateDataRequest createDataRequest);

}
