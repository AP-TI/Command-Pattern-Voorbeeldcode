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
public class TVOffCommand implements Command{
    TV tv;
    
    public TVOffCommand(TV tv){
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
    
}
