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
public class StereoOnWithCdCommand implements Command{
    Stereo stereo;
    
    public StereoOnWithCdCommand(Stereo stereo){
        this.stereo = stereo;
    }
    
    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
    
}
