/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

/**
 *
 * @author nesmaabdellatif
 */
public class city implements Comparable<city> {
    int city_id;
    String city;
    String country_id;
    String capital;
    double population;
    
    public city(String city_id, String city, String country_id, String capital, String population)
    {
    this.city_id = Integer.parseInt(city_id);
    this.city = city;
    this.country_id = country_id;
    this.capital = capital;
    this.population = Integer.parseInt(population);
    }

    public int getCity_id() {
        return city_id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry_id() {
        return country_id;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
    
    
    @Override
    public String toString() {
        return city; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(city o) {
        if (this.population > o.population) {
 
            // if current object is greater,then return 1
            return 1;
        }
        else if (this.population < o.population) {
 
            // if current object is greater,then return -1
            return -1;
        }
        else {
 
            // if current object is equal to o,then return 0
            return 0;
        }
    }
}
