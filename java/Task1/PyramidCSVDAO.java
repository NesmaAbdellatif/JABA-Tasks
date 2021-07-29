/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nesmaabdellatif
 */
public class PyramidCSVDAO {
    List<Pyramid> pyramid;
    
    public PyramidCSVDAO()
    {
        this.pyramid = new ArrayList<Pyramid>();
    }
    
    public List<Pyramid> readPyramidFromCSV(String fileName)
    {
        
        File PyramidInfoFile = new File(fileName);
        List<String> lines = new ArrayList<String>();
        
        try
        {
            lines = Files.readAllLines((PyramidInfoFile.toPath()));
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
            
            pyramid.add(createPyramid(fields));
        }
        return pyramid;
    }
    
    public Pyramid createPyramid(String[] metadata)
    {
        Pyramid Pyramid = new Pyramid(metadata[0], metadata[1], metadata[2], metadata[3]);
        return Pyramid;
    }
    
}
