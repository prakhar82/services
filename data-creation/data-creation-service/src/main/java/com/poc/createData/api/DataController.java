package com.poc.createData.api;


import com.poc.ramlspringboot.api.DatumController;
import com.poc.ramlspringboot.api.model.CreateDataRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;
import java.util.logging.Logger;

public class DataController implements DatumController {
    @Autowired DataRepository dataRepository;
     Logger log;

    @Override
    public ResponseEntity<String> createCreateDataRequest(@Valid CreateDataRequest createDataRequest) {
        log.info("Store details:"+ createDataRequest);
        dataRepository.save(createDataRequest);
        String response="Data successfully created";
        return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.valueOf(response));
    }

    //public ResponseEntity<> createData()
}
