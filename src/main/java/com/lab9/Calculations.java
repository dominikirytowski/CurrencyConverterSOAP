package com.lab9;

public class Calculations {
    public double calculate (String fromCurrency, double amount){
        try {
            CurrencyServer service = new CurrencyServer();
            CurrencyServerSoap port = service.getCurrencyServerSoap12();
            String licenseKey = "";
            String toCurrency = "PLN";
            boolean rounding = true;
            String format = "";
            String date = "";
            String type = "";
            String result = port.convertToStr(licenseKey, fromCurrency, toCurrency, amount, rounding, format, date, type);
            return Double.parseDouble(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
