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
public class NumberInNameException extends RuntimeException{

    public NumberInNameException() {
    }

    public NumberInNameException(String message) {
        super(message);
    } 
}
