/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_16;

/**
 *
 * @author afernandezfontenla
 */
public class Persona extends IPodeCantar{
      @Override
    public void Cantar() {
        System.out.println("DO RE MI FA SOL LA SI DO");
    }

    void PuedeCantar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
