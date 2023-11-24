package helpers;

import java.io.IOException;

import services.remote.CountryInfoService;
import services.remote.CountryInfoServiceSoapType;

public class CountriesHelper {
    static CountryInfoServiceSoapType Info = CountriesHelper.CountriesInit();

    public static CountryInfoServiceSoapType CountriesInit() {
        CountryInfoService service = new CountryInfoService();
        CountryInfoServiceSoapType Info = service.getCountryInfoServiceSoap();
        return Info;
    }

    public static String GetCountryIsoCodeByIndex(int index) {
        String data = Info.listOfCountryNamesByName().getTCountryCodeAndName().get(index).getSISOCode();
        // System.out.println(data);
        return data;
    }

    public static String GetCountryIsoCodeByName(String name) {
        String data = Info.countryISOCode(name);
        // System.out.println(data);
        return data;
    }

    public static String ShowAllCountriesIsoCode() {
        String data = null;
        for (int i = 0; i < Info.listOfCountryNamesByName().getTCountryCodeAndName().size(); i++) {
            data = Info.listOfCountryNamesByName().getTCountryCodeAndName().get(i).getSISOCode();
             System.out.println(data);
        }
        return data;
    }

    public static String GetAllCountriesNames() {
        String data = null;
        for (int i = 0; i < Info.listOfCountryNamesByName().getTCountryCodeAndName().size(); i++) {
            data = Info.listOfCountryNamesByName().getTCountryCodeAndName().get(i).getSName();
        }
        return data;
    }

    public static String ShowAllContinentsNames() {
        String data = null;
        for (int i = 0; i < Info.listOfContinentsByName().getTContinent().size(); i++) {
            data = Info.listOfContinentsByName().getTContinent().get(i).getSName();
             System.out.println(data);
        }
        return data;
    }

    public static String GetCapitalNameByCountryName(String name) {
        String code = GetCountryIsoCodeByName(name);
        String data = Info.capitalCity(code);
        System.out.println(data);

        return data;
    }
    public static void GetCountryFlagByCountryName(String name) {
        String code = GetCountryIsoCodeByName(name);
        String data = Info.countryFlag(code);
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(data));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String GetCountryCurrencyByCountryName(String name) {
        String code = GetCountryIsoCodeByName(name);
        String data = Info.countryCurrency(code).getSName();
        return data;
    }

    public static String GetIntPhoneByCountryName(String name) {
        String code = GetCountryIsoCodeByName(name);
        String data = Info.countryIntPhoneCode(code);
        return data;
    }
    public static void ShowAllCapitalNames() {
        String capital;
        String country;
        System.out.println("Country____________________________Capital");
        for (int i = 0; i < Info.listOfCountryNamesByName().getTCountryCodeAndName().size(); i++) {
            country=Info.fullCountryInfoAllCountries().getTCountryInfo().get(i).getSName();
            capital=Info.fullCountryInfoAllCountries().getTCountryInfo().get(i).getSCapitalCity();
            System.out.println(country+"------------------------->"+capital);
        }
    }

}
