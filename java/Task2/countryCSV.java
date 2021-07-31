/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nesmaabdellatif
 */
public class countryCSV {
    List<country> country;
    
    public countryCSV()
    {
        this.country = new ArrayList<country>();
    }
    
    public List<country> readCountryFromCSV(String fileName)
    {
        
        File countryInfoFile = new File(fileName);
        List<String> lines = new ArrayList<String>();
        
        try
        {
            lines = Files.readAllLines((countryInfoFile.toPath()));
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
            
            country.add(createCountry(fields));
        }
        return country;
    }
    
    public country createCountry(String[] metadata)
    {
        country country = new country(metadata[0], metadata[1]);
        return country;
    }
    
}
