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
public class Stereo {
    String name;
    public Stereo(String name){
        this.name = name;
    }
    public void on(){
        System.out.println(name + " stereo is on");
    }
    public void off(){
        System.out.println(name + " stereo is off");
    }
    public void setCd(){
        System.out.println(name + " stereo playing cd");
    }
    public void setDvd(){
        System.out.println(name + " stereo playing dvd");
    }
    public void setRadio(){
        System.out.println(name + " stereo playing radio");
    }
    public void setVolume(int volume){
        System.out.println(name + " stereo volume is set to " + volume);
    }
}
