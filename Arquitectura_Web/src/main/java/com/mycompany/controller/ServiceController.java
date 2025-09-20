package com.mycompany.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//APIKEY = XUD2YQOG2P0LWY3E

@RestController
@RequestMapping(value = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=IBM&interval=5min&apikey="+APIKEY)

public class ServiceController {

    
        
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGetRecursoXX(){
        try {
            return new ResponseEntity<>(data,HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(XXController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error bla bla bla",HttpStatus.NOT_FOUND);
        }        
    }

}

