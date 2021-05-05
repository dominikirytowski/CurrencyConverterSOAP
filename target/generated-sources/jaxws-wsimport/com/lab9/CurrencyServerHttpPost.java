
package com.lab9;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CurrencyServerHttpPost", targetNamespace = "http://webservices.cloanto.com/currencyserver/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CurrencyServerHttpPost {


    /**
     * Loads a settings file. Access to this administrative operation may be restricted.
     * 
     * @param licenseKey
     * @param file
     */
    @WebMethod(operationName = "AdminLoad")
    public void adminLoad(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "file")
        String file);

    /**
     * Sends a message as specified in the notification options. Access to this administrative operation may be restricted.
     * 
     * @param licenseKey
     * @param text
     * @param type
     */
    @WebMethod(operationName = "AdminMessage")
    public void adminMessage(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "text")
        String text,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "type")
        String type);

    /**
     * Saves a settings file. Access to this administrative operation may be restricted.
     * 
     * @param licenseKey
     * @param file
     */
    @WebMethod(operationName = "AdminSave")
    public void adminSave(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "file")
        String file);

    /**
     * Establishes a connection to the data source(s) and updates the currency data. Access to this administrative operation may be restricted.
     * 
     * @param licenseKey
     */
    @WebMethod(operationName = "AdminUpdateNow")
    public void adminUpdateNow(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Converts a currency amount. The result is a number which can optionally be rounded. Leave the date and type parameters empty for forward compatibility.
     * 
     * @param date
     * @param licenseKey
     * @param amount
     * @param toCurrency
     * @param rounding
     * @param fromCurrency
     * @param type
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConvertToNum")
    @WebResult(name = "double", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public double convertToNum(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "fromCurrency")
        String fromCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "toCurrency")
        String toCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "amount")
        String amount,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "rounding")
        String rounding,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "date")
        String date,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "type")
        String type);

    /**
     * Converts a currency amount. The result is a string which can optionally be rounded and formatted. Either fromCurrency or toCurrency (but not both) may contain a list of semicolon-separated active currencies. Leave the date and type parameters empty for forward compatibility.
     * 
     * @param date
     * @param licenseKey
     * @param amount
     * @param toCurrency
     * @param format
     * @param rounding
     * @param fromCurrency
     * @param type
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConvertToStr")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String convertToStr(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "fromCurrency")
        String fromCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "toCurrency")
        String toCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "amount")
        String amount,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "rounding")
        String rounding,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "format")
        String format,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "date")
        String date,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "type")
        String type);

    /**
     * Returns a currency code (ISO 4217 Alpha-3) associated to the specified country (ISO 3166 Alpha-2).
     * 
     * @param activeOnly
     * @param licenseKey
     * @param country
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CountryToCurrency")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String countryToCurrency(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "country")
        String country,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "activeOnly")
        String activeOnly);

    /**
     * Returns a semicolon-separated list of active currencies.
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Currencies")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String currencies(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the currency custom string based on the specified locale. The currency parameter may contain a list of semicolon-separated active currencies.
     * 
     * @param licenseKey
     * @param currency
     * @param locale
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CurrencyCustom")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String currencyCustom(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "locale")
        String locale);

    /**
     * Returns a Boolean value indicating whether the currency is included in the list of active currencies.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CurrencyExists")
    @WebResult(name = "boolean", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public boolean currencyExists(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns the number of times this currency has been referenced by a COM object or by the Web service.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns long
     */
    @WebMethod(operationName = "CurrencyHits")
    @WebResult(name = "long", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public long currencyHits(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns the date and time of the last modification to the Rate property (local time). If the rate has never been set or changed an empty string is returned. The currency parameter may contain a list of semicolon-separated active currencies.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CurrencyLastChangeTimeLocal")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String currencyLastChangeTimeLocal(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns the date and time of the last modification to the Rate property (Universal Time). If the rate has never been set or changed an empty string is returned. The currency parameter may contain a list of semicolon-separated active currencies.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CurrencyLastChangeTimeUT")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String currencyLastChangeTimeUT(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns a Boolean value indicating whether the currency is legal tender.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CurrencyLegalTender")
    @WebResult(name = "boolean", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public boolean currencyLegalTender(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns the extended name of the currency based on the specified locale and title style. The currency parameter may contain a list of semicolon-separated active currencies.
     * 
     * @param licenseKey
     * @param currency
     * @param titleStyle
     * @param locale
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CurrencyName")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String currencyName(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "locale")
        String locale,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "titleStyle")
        String titleStyle);

    /**
     * Returns a Boolean value indicating whether the currency is a physical currency.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CurrencyPhysical")
    @WebResult(name = "boolean", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public boolean currencyPhysical(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns the identifier of a regime or monetary union or an empty string. The currency parameter may contain a list of semicolon-separated active currencies.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CurrencyRegime")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String currencyRegime(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns the seconds elapsed since the last modification to the currency's exchange rate.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns long
     */
    @WebMethod(operationName = "CurrencySecondsSinceLastChange")
    @WebResult(name = "long", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public long currencySecondsSinceLastChange(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns the number of servers providing exchange rate data for the currency.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns long
     */
    @WebMethod(operationName = "CurrencyServers")
    @WebResult(name = "long", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public long currencyServers(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns the smallest unit for the currency. Trailing zero characters are used to specify the preferred format for rounding. The currency parameter may contain a list of semicolon-separated active currencies.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CurrencySmallestUnit")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String currencySmallestUnit(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns a Boolean value indicating whether the currency is a subunit of BaseUnit at a constant rate.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CurrencySubUnit")
    @WebResult(name = "boolean", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public boolean currencySubUnit(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns the currency symbol based on the specified locale. The currency parameter may contain a list of semicolon-separated active currencies.
     * 
     * @param licenseKey
     * @param currency
     * @param locale
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CurrencySymbol")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String currencySymbol(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "locale")
        String locale);

    /**
     * Returns a Boolean value indicating whether the currency has been referenced by a recent warning condition.
     * 
     * @param licenseKey
     * @param currency
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CurrencyWarning")
    @WebResult(name = "boolean", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public boolean currencyWarning(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currency")
        String currency);

    /**
     * Returns the current date and time (local time).
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CurrentTimeLocal")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String currentTimeLocal(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the current date and time (Universal Time).
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CurrentTimeUT")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String currentTimeUT(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns a currency code (ISO 4217 Alpha-3) associated to the specified domain (string ending with IANA TLD).
     * 
     * @param activeOnly
     * @param licenseKey
     * @param domain
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DomainToCurrency")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String domainToCurrency(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "domain")
        String domain,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "activeOnly")
        String activeOnly);

    /**
     * Returns the copyright information provided by the data source(s), if any.
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InformationCopyright")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String informationCopyright(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the creation date and time of the current exchange rate data (local time). If this information is not available an empty string is returned.
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InformationCreationTimeLocal")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String informationCreationTimeLocal(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the creation date and time of the current exchange rate data (Universal Time). If this information is not available an empty string is returned.
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InformationCreationTimeUT")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String informationCreationTimeUT(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the expiration date and time of the current exchange rate data (local time). If this information is not available an empty string is returned.
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InformationExpirationTimeLocal")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String informationExpirationTimeLocal(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the expiration date and time of the current exchange rate data (Universal Time). If this information is not available an empty string is returned.
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InformationExpirationTimeUT")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String informationExpirationTimeUT(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the message(s) from the data source(s), if any.
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InformationMessage")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String informationMessage(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the name(s) of the data source(s).
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InformationSource")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String informationSource(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the date and time of the last modification to the current exchange rate data (local time). If the rates have never been set or changed an empty string is returned.
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LastChangeTimeLocal")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String lastChangeTimeLocal(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the date and time of the last modification to the current exchange rate data (Universal Time). If the rates have never been set or changed an empty string is returned.
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LastChangeTimeUT")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String lastChangeTimeUT(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns a currency code (ISO 4217 Alpha-3) associated to the specified locale (Windows LCID or ISO 639-2 Alpha-2).
     * 
     * @param activeOnly
     * @param licenseKey
     * @param locale
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LocaleToCurrency")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String localeToCurrency(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "locale")
        String locale,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "activeOnly")
        String activeOnly);

    /**
     * Returns the exchange (conversion) rate. The result is a number which can optionally be rounded. Leave the date and type parameters empty for forward compatibility.
     * 
     * @param date
     * @param licenseKey
     * @param toCurrency
     * @param rounding
     * @param type
     * @param baseCurrency
     * @return
     *     returns double
     */
    @WebMethod(operationName = "RateNum")
    @WebResult(name = "double", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public double rateNum(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "baseCurrency")
        String baseCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "toCurrency")
        String toCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "rounding")
        String rounding,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "date")
        String date,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "type")
        String type);

    /**
     * Returns the exchange (conversion) rate. The result is a string which can optionally be rounded and formatted. Either baseCurrency or toCurrency (but not both) may contain a list of semicolon-separated active currencies. Leave the date and type parameters empty for forward compatibility.
     * 
     * @param date
     * @param licenseKey
     * @param toCurrency
     * @param format
     * @param rounding
     * @param type
     * @param baseCurrency
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RateStr")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String rateStr(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "baseCurrency")
        String baseCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "toCurrency")
        String toCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "rounding")
        String rounding,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "format")
        String format,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "date")
        String date,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "type")
        String type);

    /**
     * Returns the effective date and time (local time) of the exchange or conversion rate of toCurrency, relative to baseCurrency. Leave the date and type parameters empty for forward compatibility.
     * 
     * @param date
     * @param licenseKey
     * @param toCurrency
     * @param priority
     * @param type
     * @param baseCurrency
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RateTimeLocal")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String rateTimeLocal(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "baseCurrency")
        String baseCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "toCurrency")
        String toCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "priority")
        String priority,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "date")
        String date,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "type")
        String type);

    /**
     * Returns the effective date and time (Universal Time) of the exchange or conversion rate of toCurrency, relative to baseCurrency. Leave the date and type parameters empty for forward compatibility.
     * 
     * @param date
     * @param licenseKey
     * @param toCurrency
     * @param priority
     * @param type
     * @param baseCurrency
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RateTimeUT")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String rateTimeUT(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "baseCurrency")
        String baseCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "toCurrency")
        String toCurrency,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "priority")
        String priority,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "date")
        String date,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "type")
        String type);

    /**
     * Returns the seconds elapsed since the last modification to one or more exchange rates.
     * 
     * @param licenseKey
     * @return
     *     returns long
     */
    @WebMethod(operationName = "SecondsSinceLastChange")
    @WebResult(name = "long", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public long secondsSinceLastChange(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

    /**
     * Returns the software version.
     * 
     * @param licenseKey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Version")
    @WebResult(name = "string", targetNamespace = "http://webservices.cloanto.com/currencyserver/", partName = "Body")
    public String version(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "licenseKey")
        String licenseKey);

}