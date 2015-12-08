package com.cypher.cryptopiatrader.dtos;

import java.util.List;


public class CurrenciesDTO {
    private String Success;
    private String Message;
    private List<CurrencyDataDTO> data;
    private String error;

    public CurrenciesDTO() {
    }

    public String getSuccess() {
        return Success;
    }

    public void setSuccess(String Success) {
        this.Success = Success;
    }
    
    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public List<CurrencyDataDTO> getData() {
        return data;
    }

    public void setData(List<CurrencyDataDTO> data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
}
