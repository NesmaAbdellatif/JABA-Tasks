/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

/**
 *
 * @author nesmaabdellatif
 */
public class lab3 {
    
     public static void main(String[] args) {
        cityCSV cit=new cityCSV();
        List<city> cities = cit.readCityFromCSV("/Users/nesmaabdellatif/Downloads/ITI/Java/Java and UML_Amr Elshafey 1/csv files/city.csv");
     
        countryCSV co=new countryCSV();
        List<country> countries = co.readCountryFromCSV("/Users/nesmaabdellatif/Downloads/ITI/Java/Java and UML_Amr Elshafey 1/csv files/country.csv");
    
   
        Map<String, Optional<city>> highCityOfcountry = cities.stream()
                .collect(groupingBy(city::getCountry_id, maxBy(comparing(city::getPopulation))));
        // System.out.println(highCityOfcountry);
         
//         Map<String, Optional<city>> highCityByContinent = cities.stream()
//                .collect(groupingBy(city::getContinent, maxBy(comparing(city::getPopulation))));
//         System.out.println(highCityByContinent);
        
        Map<String, Optional<city>> highCapital = cities.stream()
                .collect(groupingBy(city::getCapital, maxBy(comparing(city::getPopulation))));
         System.out.println(highCapital);
         
              }

}
     

