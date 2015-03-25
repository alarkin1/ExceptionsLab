/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Alex
 */
public class InvalidNameException extends RuntimeException{

    public InvalidNameException() {
    }

    public InvalidNameException(String message) {
        super(message);
    }    
}
