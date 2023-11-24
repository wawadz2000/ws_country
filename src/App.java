import java.util.Scanner;

import helpers.CountriesHelper;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;
        while (true) {
            System.out.println("-------------- WELCOME----------");
            System.out.println("1- ShowAllCountriesIsoCode");
            System.out.println("2- ShowAllContinentsNames");
            System.out.println("3- ShowAllCapitalNames");
            System.out.println("4- ShowAllCountriesIsoCode");
            System.out.println("5- ShowAllCountriesNames");
            System.out.println("6- GetCapitalNameByCountryName");
            System.out.println("7- GetCountryIsoCodeByName");
            System.out.println("8- GetCountryCurrencyByCountryName");
            System.out.println("9- GetCountryFlagByCountryName");
            System.out.println("10- GetIntPhoneByCountryName");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    CountriesHelper.ShowAllCountriesNames();
                    break;
                case 2:
                    CountriesHelper.ShowAllContinentsNames();
                    break;
                case 3:
                    CountriesHelper.ShowAllCapitalNames();
                    break;
                case 4:
                    CountriesHelper.ShowAllCountriesIsoCode();
                    break;
                case 5:
                    CountriesHelper.ShowAllCountriesNames();
                    break;
                case 6:
                    System.out.println("Country: ");
                    name = sc.next();
                    CountriesHelper.GetCapitalNameByCountryName(name);
                    break;
                case 7:
                    System.out.println("Country: ");
                    name = sc.next();
                    CountriesHelper.GetCountryIsoCodeByName(name);
                    break;
                case 8:
                    System.out.println("Country: ");
                    name = sc.next();
                    System.out.println(CountriesHelper.GetCountryCurrencyByCountryName(name));
                    break;
                case 9:
                    System.out.println("Country: ");
                    name = sc.next();
                    CountriesHelper.GetCountryFlagByCountryName(name);
                    break;
                case 10:
                    System.out.println("Country: ");
                    name = sc.next();
                    System.out.println(CountriesHelper.GetIntPhoneByCountryName(name));
                    break;
                default:
                    break;
            }
        }
    }
}
