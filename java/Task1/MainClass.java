/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import java.util.List;

/**
 *
 * @author nesmaabdellatif
 */
public class MainClass {
     public static void main(String[] args) {
        PyramidCSVDAO pDAO=new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidFromCSV("/Users/nesmaabdellatif/Downloads/ITI/Java/Java and UML_Amr Elshafey 1/csv files/pyramids.csv");
        int i = 0;
        for (Pyramid p:pyramids)
        {
            System.out.println("#"+(i++)+p.getPharaoh());
        }
        
    }
}
