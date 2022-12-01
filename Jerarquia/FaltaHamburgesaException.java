/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.jerarquia;

/**
 *
 * @author nayel
 */
public class FaltaHamburgesaException extends ErrorDeComidaException{
    public FaltaHamburgesaException(){
        super( "No hay suficientes hamburgesas.");
    }
    
    public FaltaHamburgesaException(String msj){
        super(msj);
    }
}
