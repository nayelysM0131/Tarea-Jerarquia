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
public class FaltaPapitasFritasException extends ErrorDeComidaException{
    public FaltaPapitasFritasException(){
        super( "No hay suficientes papitas fritas.");
    }
    
    public FaltaPapitasFritasException(String msj){
        super(msj);
    }
}
