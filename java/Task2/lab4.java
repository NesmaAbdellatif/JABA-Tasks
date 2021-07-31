/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author nesmaabdellatif
 */
public class lab4 {
    public static void main(String[] args) {
        
        
        cityCSV cit=new cityCSV();
        List<city> cities = cit.readCityFromCSV("/Users/nesmaabdellatif/Downloads/ITI/Java/Java and UML_Amr Elshafey 1/csv files/city.csv");
     
        countryCSV co=new countryCSV();
        List<country> countries = co.readCountryFromCSV("/Users/nesmaabdellatif/Downloads/ITI/Java/Java and UML_Amr Elshafey 1/csv files/country.csv");
        
        //map with key = population and value = city
        LinkedHashMap<Double, String> unSortedCity = new LinkedHashMap<>();
        for(city city: cities){
        unSortedCity.put(city.getPopulation(), city.getCity());
        }
        
        //sort the map by key(population)
        LinkedHashMap<Double, String> sortedCity = new LinkedHashMap<>();

        unSortedCity.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEachOrdered(x -> sortedCity.put(x.getKey(), x.getValue()));
        
        //list of sorted population
        List <Double> sortedPop =   unSortedCity.keySet()
                                                 .stream()
                                                 .sorted()
                                                 .collect(Collectors.toList());
        
//        median= sortedPop.get((sortedPop.size()/2));
//                System.out.println(sortedCity.get(median));

       
        double median, lowerQuartile, upperQuartile;

        if (sortedCity.size() % 2 == 0) {
            median= (double)sortedPop.get((sortedPop.size()/2)) + (double)sortedPop.get((sortedPop.size()/2 + 1));
            lowerQuartile = (double)sortedPop.get((sortedPop.size()/4)) + (double)sortedPop.get((sortedPop.size()/4 + 1));
            upperQuartile = (double)sortedPop.get((sortedPop.size()*3/4)) + (double) sortedPop.get((sortedPop.size()*3/4 + 1));
        }
        else {
            median= (double)sortedPop.get((sortedPop.size()/2));
            lowerQuartile = (double)sortedPop.get((sortedPop.size()/4));
            upperQuartile = (double)sortedPop.get((sortedPop.size()*3/4));
        }
        
        //get the city name by its population
        String medianCity, lowerQuartileCity, upperQuartileCity;
        
        medianCity = sortedCity.get((double)median);
        lowerQuartileCity = sortedCity.get((double)lowerQuartile);
        upperQuartileCity = sortedCity.get((double)upperQuartile);
        
        System.out.println("median: " + medianCity +" lowerQuartile: "+ lowerQuartileCity +" upperQuartile: "+ upperQuartileCity);



    }
}
