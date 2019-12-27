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
public class TVSetDVDChannelCommand implements Command{
    TV tv;
    String prevChannel;
    
    public TVSetDVDChannelCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        prevChannel = tv.getChannel();
        tv.setInputChannel("DVD");
    }

    @Override
    public void undo() {
        tv.setInputChannel(prevChannel);
    }
    
}
