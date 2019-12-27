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
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String name;
    int speed;

    
    public CeilingFan(String name){
        this.name = name;
    }
    public void high(){
        speed = HIGH;
        System.out.println("Fan speed is set to high");
    }
    public void medium(){
        speed = MEDIUM;
        System.out.println("Fan speed is set to medium");
    }
    public void low(){
        speed = LOW;
        System.out.println("Fan speed is set to low");
    }
    public void off(){
        speed = OFF;
        System.out.println(name + " ceiling fan is off");
    }
    
    public int getSpeed() {
        return speed;
    }
}
