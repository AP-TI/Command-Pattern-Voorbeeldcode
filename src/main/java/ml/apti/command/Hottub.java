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
public class Hottub {
    public void on(){
        System.out.println("Hottub is on");
    }
    public void off(){
        System.out.println("Hottub is off");
    }
    public void circulate(){
        System.out.println("Circulating");
    }
    public void jetsOn(){
        System.out.println("Jets are on");
    }
    public void jetsOff(){
        System.out.println("Jets are off");
    }
    public void setTemperature(int temperature){
        System.out.println("Temperature is set to " + temperature);
    }
}
