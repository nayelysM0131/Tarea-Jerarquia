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
public class FaltaDeBatidoException extends ErrorDeBebidaException{
    public FaltaDeBatidoException(){
        super("No hay Suficiente batido");
    }
    
    public FaltaDeBatidoException(String msj){
        super(msj);
    }
}
