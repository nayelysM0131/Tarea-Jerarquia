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
public class FaltaDeRefrescoException  extends ErrorDeBebidaException{
    public FaltaDeRefrescoException(){
        super("No hay suficiente refresco");
    }
    
    public FaltaDeRefrescoException(String msj){
        super(msj);
    }
}
