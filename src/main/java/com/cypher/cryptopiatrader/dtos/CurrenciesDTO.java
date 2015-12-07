package com.cypher.cryptopiatrader.dtos;


public class CurrenciesDTO {
    private boolean success;
    private String message;
    private CurrencyDataDTO[] data;
    private String error;

    public CurrenciesDTO() {
    }
    

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CurrencyDataDTO[] getData() {
        return data;
    }

    public void setData(CurrencyDataDTO[] data) {
        this.data = data;
    }

}
