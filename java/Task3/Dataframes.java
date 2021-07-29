/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import joinery.DataFrame;
import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.Table;

/**
 *
 * @author nesmaabdellatif
 */
public class Dataframes {
    public static void main(String[] args) {
       
        try {
            
        //using joinery
        
        //load data
        DataFrame<Object> df_stud= DataFrame.readCsv("src/main/resources/data/Students.csv");
        DataFrame<Object> df_subj= DataFrame.readCsv("src/main/resources/data/subjects.csv");
        
            //join
            DataFrame<Object> join = df_stud.join(df_subj);
            System.out.println(join);
            
            //merge
            //DataFrame<Object> merge = df_stud.merge(df_subj);
            //System.out.println(merge);

            //add columns
            df_subj.add("Hours of course", Arrays.<Object>asList(4,3,5,4));
            System.out.println(df_subj);
            
        }catch (IOException e){
            System.out.println("There is an error");

        }
        
        
            /////////////////////////////////////////////////////////////////////////////
//        try {
//            //using Tablesaw
//            
//            //load data
//            Table students = Table.read().csv("src/main/resources/data/Students.csv");
//            Table subjects = Table.read().csv("src/main/resources/data/subjects.csv");
//            
            //join
            //Table join = students.joinOn("Student_ID").inner(subjects);
            //System.out.println(join);
            
            //concatenation
            //Table result = students.append(subjects);
            //System.out.println(result);
            
            //add column
            //Double[] hr ={4.0,3.0,5.0,4.0};
            //DoubleColumn hours =DoubleColumn.create("Hours of course", hr);
            //System.out.println(subjects.addColumns(hours));
            
//        } catch (IOException ex) {
//            Logger.getLogger(Dataframes.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
}
