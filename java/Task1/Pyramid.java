/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

/**
 *
 * @author nesmaabdellatif
 */
public class Pyramid {
    String pharaoh;
    String modern_name;
    String site;
    double height;
    
    public Pyramid(String pharaoh, String modern_name, String site,String height)
    {
    this.pharaoh = pharaoh;
    this.modern_name = modern_name;
    this.site = site;
    this.height = Double.parseDouble(height);
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public String getModern_name()
    {
        return modern_name;
    }
    
    public String getPharaoh()
    {
        return pharaoh;
    }
    
    public String getSite()
    {
        return site;
    }
    
     public void setHeight(double height)
    {
         this.height = height;
    }
    
    public void setModern_name(String modern_name)
    {
        this.modern_name = modern_name;
    }
    
    public void setPharaoh(String pharaoh)
    {
        this.pharaoh = pharaoh;
    }
    
    public void setSite(String site)
    {
        this.site= site;
    }

//    @Override
//    public String toString() {
//        return pharaoh; //To change body of generated methods, choose Tools | Templates.
//    }
//    
    
    
}
