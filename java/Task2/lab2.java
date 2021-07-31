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
public class lab2 {
     public static void main(String[] args) {
    
       //lab2:-
        
        String str1="hi";
        String str2="hellow";
        stringTest isbetter = (s1,s2)->s1.length()>s2.length();
        String longer= lab2.betterString(str1, str2, isbetter);
        System.out.println(longer);
        
        
        boolean result = str1.chars().allMatch(Character::isLetter);
        System.out.println(result);
     }
        
        public static String betterString(String str1, String str2, stringTest isbetter){
        if(isbetter.test(str1, str2)){
        return str1;
        }
        else{
        return str2;
        }
        
     }
    
}
