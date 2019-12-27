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
public class TV {
    String name;
    String channel;
    int volume;

    public int getVolume() {
        return volume;
    }

    public String getChannel() {
        return channel;
    }
    

    public TV(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + "TV is on");
    }
    
    public void off(){
        System.out.println(name + "TV is on");
    }
    
    public void setInputChannel(String channel){
        this.channel = channel;
        System.out.println(name + " TV channel is set for " + channel);
    }
    
    public void setVolume(int volume){
        System.out.println(name + " TV volume is " + volume);
    }
}
