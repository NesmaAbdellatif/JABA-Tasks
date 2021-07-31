/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import Task1.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author nesmaabdellatif
 */
public class lab1 {
     public static void main(String[] args) {
        cityCSV cit=new cityCSV();
        List<city> cities = cit.readCityFromCSV("/Users/nesmaabdellatif/Downloads/ITI/Java/Java and UML_Amr Elshafey 1/csv files/city.csv");
     
        countryCSV co=new countryCSV();
        List<country> countries = co.readCountryFromCSV("/Users/nesmaabdellatif/Downloads/ITI/Java/Java and UML_Amr Elshafey 1/csv files/country.csv");
       
        
        //lab1:-
        
        Map<String,List<city>> country = new HashMap<>();
        for(city city: cities){
            if(country.get(city.getCountry_id()) == null){
            List<city> l = new ArrayList<>();
            l.add(city);
            country.put(city.getCountry_id(), l);
            }
            else{
            country.get(city.getCountry_id()).add(city);            
            }
        }
        
       
        //country.forEach((k, v) -> v.stream().map(city::getPopulation).sorted().collect(Collectors.toList()));
        //country.forEach((k, v) -> v.sort(Comparator.comparing(city::getPopulation)));
        country.forEach((k, v) -> Collections.sort(v));
        System.out.println(country);
     }
}
        
        
      
   
        
     
     
     
     
     

