package com.cypher.cryptopiatrader;

import com.cypher.cryptopiatrader.dtos.CurrenciesDTO;
import com.cypher.cryptopiatrader.exceptions.RestException;
import com.cypher.cryptopiatrader.services.CurrenciesService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    
    public static void main(String[] args) throws IOException {
        try {
            CurrenciesDTO currenciesDTO = CurrenciesService.getCurrencies();
        } catch (RestException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
