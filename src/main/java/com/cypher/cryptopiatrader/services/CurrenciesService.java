/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cypher.cryptopiatrader.services;

import com.cypher.cryptopiatrader.dtos.CurrenciesDTO;
import com.cypher.cryptopiatrader.exceptions.RestException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.io.IOException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Andres
 */
public class CurrenciesService extends CriptopiaTraderBaseService {
    private static final String GET_CURRENCIES_PATH = "GetCurrencies";
   /* 
    public static CurrenciesDTO getCurrencies() throws RestException{
        ClientResponse response = null;        
        try {
            Client client = Client.create();
            WebResource webResource = client.resource(BASE_URL + GET_CURRENCIES_PATH);
            response = webResource.accept("application/json").get(ClientResponse.class);
            if (response.getStatus() != 200)
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new RestException(e);
        }
        JSONObject inputJsonObj = new JSONObject();
        inputJsonObj = response.getEntity(inputJsonObj);
        
        CurrenciesDTO currenciesDTO = 
        return currenciesDTO;
    }
    */
    public static CurrenciesDTO getCurrencies() throws RestException, IOException{
        ClientResponse response = null;        
        try {
            Client client = Client.create();
            WebResource webResource = client.resource(BASE_URL + GET_CURRENCIES_PATH);
            response = webResource.accept("application/json; encoding=utf8; charset=utf8").get(ClientResponse.class);
            if (response.getStatus() != 200)
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new RestException(e);
        }
        
        String output = response.getEntity(String.class);
        System.out.println(output);
        
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        
        CurrenciesDTO currenciesDTO = mapper.readValue(output, CurrenciesDTO.class);
        return currenciesDTO;
    }
    

}
