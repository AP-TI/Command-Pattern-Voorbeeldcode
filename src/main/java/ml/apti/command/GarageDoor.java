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
public class GarageDoor {
    String name;
    public GarageDoor(String name){
        this.name = name;
    }
    public void up(){
        System.out.println("Garage door is open.");
    }
    
    public void down(){
        System.out.println("Garage door is closed.");
    }
    
    public void stop(){
        System.out.println("Garage door stopped.");
    }
    
    public void lightOn(){
        System.out.println("Garage light is on.");
    }
    
    public void lightOff(){
        System.out.println("Garage light is off.");
    }
}
