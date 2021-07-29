/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.io.IOException;
import joinery.DataFrame;
import static tech.tablesaw.aggregate.AggregateFunctions.max;
import static tech.tablesaw.aggregate.AggregateFunctions.mean;
import static tech.tablesaw.aggregate.AggregateFunctions.min;
import static tech.tablesaw.aggregate.AggregateFunctions.stdDev;
import tech.tablesaw.api.Table;

/**
 *
 * @author nesmaabdellatif
 */
public class TitanicDataAnalysis {
    public static void main(String[] args) throws IOException{

        String path = "src/main/resources/data/titanic.csv";
        
        //using joinery
        try{
        //load data from csv
        DataFrame<Object> df= DataFrame.readCsv(path);
        
        //print data statistics
        System.out.println(df.describe());
        }catch(IOException e){
            System.out.println("There is an error");
        }
        
        ////////////////////////////////////////////////////////////////////////////////////
        
        
        //using Tablesaw
        
       //load data from csv
       Table titanic = Table.read().csv(path);
       
       //get data summary
       Table summary = titanic.summary();
       
       //get data statistics
       Table means = titanic.summarize(titanic.columnNames(), mean).apply();
       Table maxs = titanic.summarize(titanic.columnNames(), max).apply();
       Table mins = titanic.summarize(titanic.columnNames(), min).apply();
       Table std = titanic.summarize(titanic.columnNames(),stdDev ).apply();
       
       
       //print results
       System.out.println(summary);
       System.out.println(maxs);
       System.out.println(mins);
       System.out.println(means);
       System.out.println(std);
       
       
  
    }
        
        
}
