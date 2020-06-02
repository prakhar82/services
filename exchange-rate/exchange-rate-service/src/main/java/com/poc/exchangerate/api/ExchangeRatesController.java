package com.poc.exchangerate.api;

import com.poc.ramlspringboot.api.LatestController;
import com.poc.ramlspringboot.api.model.Response;
import com.poc.restclient.api.LatestRatesApi;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ExchangeRatesController implements LatestController {
    @Autowired
    public LatestRatesApi latestRatesApi;



    @Override
    public ResponseEntity<Response> getResponse() {
        com.poc.restclient.model.Response responseSource = latestRatesApi.latestGet();

        ModelMapper modelMapper = new ModelMapper();
        Response responseDestination = modelMapper.map(responseSource, Response.class);

        return ResponseEntity.ok(responseDestination);
    }
}
