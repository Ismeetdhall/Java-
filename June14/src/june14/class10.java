/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june14;

/**
 *
 * @author comp10
 */
public class class10 {
    
    public static void main(String[] args )
    {
        result ram = new result();
        result sham = new result();
        result sita = new result();
        result geeta = new result();
        
        ram.setStuName("Ram");
        ram.setMarks();
        ram.calculateTotal();
        ram.showResult();
        
        sham.setStuName("Sham");
        sham.setMarks();
        sham.calculateTotal();
        sham.showResult();
        
        sita.setStuName("sita");
        sita.setMarks();
        sita.calculateTotal();
        sita.showResult();
        
        
        geeta.setStuName("geeta");
        geeta.setMarks();
        geeta.calculateTotal();
        geeta.showResult();
    }
    
}
