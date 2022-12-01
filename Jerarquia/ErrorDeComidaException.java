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
public class ErrorDeComidaException extends ErrorEnElPedidoException {
    public ErrorDeComidaException(){
        super( "Ha ocurrido un error en los ingredientes de la comida");
    }
    
    public ErrorDeComidaException(String msj){
        super(msj);
    }
    
}
