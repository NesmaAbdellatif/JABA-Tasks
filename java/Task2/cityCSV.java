/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import Task1.Pyramid;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nesmaabdellatif
 */
public class cityCSV {
    List<city> city;
    
    public cityCSV()
    {
        this.city = new ArrayList<city>();
    }
    
    public List<city> readCityFromCSV(String fileName)
    {
        
        File cityInfoFile = new File(fileName);
        List<String> lines = new ArrayList<String>();
        
        try
        {
            lines = Files.readAllLines((cityInfoFile.toPath()));
        }
        catch(Exception e)
        {
            System.out.println("An issue has been happend during reading pyramids info:" + e);
        }
        
        for (int LineIdx =1; LineIdx < lines.size(); LineIdx++)
        {
            String line = lines.get(LineIdx);
            String[] fields = line.split(",");
            
            for (int fieldIndex = 0; fieldIndex < fields.length; fieldIndex++)
            {
                fields[fieldIndex] = fields[fieldIndex].trim();
            }
            
            city.add(createCity(fields));
        }
        return city;
    }
    
    public city createCity(String[] metadata)
    {
        city city = new city(metadata[0], metadata[1], metadata[2], metadata[3], metadata[4]);
        return city;
    }

    
    
    
}


