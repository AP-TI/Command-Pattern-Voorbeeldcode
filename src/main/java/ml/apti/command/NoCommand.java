/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.apti.command;

/**
 *
 * @author maxim
 */
public class NoCommand implements Command {
    public void execute(){
        System.out.println("No command");
    }
    public void undo(){
        
    }
}
