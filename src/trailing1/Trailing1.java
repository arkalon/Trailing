/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailing1;

/**
 *
 * @author kenth
 */
public class Trailing1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String guitar = "Loud";
        if(guitar.contains("Loud")){
            guitar = "Not loud";
        } else{
            guitar = "Loud";
        }
        System.out.println(guitar);
    }
    
}
