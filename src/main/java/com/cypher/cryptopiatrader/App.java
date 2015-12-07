package com.cypher.cryptopiatrader;

import com.cypher.cryptopiatrader.dtos.CurrenciesDTO;
import com.cypher.cryptopiatrader.exceptions.RestException;
import com.cypher.cryptopiatrader.services.CurrenciesService;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

private static final String BASE_URL = "https://www.cryptopia.co.nz/api/";
private static final String GET_CURRENCIES_PATH = "GetCurrencies";
    
    public static void main(String[] args) {
    try {
        CurrenciesDTO currenciesDTO = CurrenciesService.getCurrencies();
    } catch (RestException ex) {
        Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
        

    }
}
