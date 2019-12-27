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
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
        
        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        TVSetDVDChannelCommand tvSetDVD = new TVSetDVDChannelCommand(tv);
        
        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, ceilingFanOn, stereoOnWithCd, tvOn, tvSetDVD};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, ceilingFanOff, stereoOff, tvOff};
        
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        //remoteControl.setCommand(0, () -> {livingRoomLight.on();}, () -> {livingRoomLight.off();});
        //Lambda expressie werkt enkel als Command een functionele interface is (interface met 1 methode).
        //remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        //Zelfde met method reference
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCd, stereoOff);
        remoteControl.setCommand(4, ceilingFanHigh, ceilingFanLow);
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);
        
        System.out.println(remoteControl);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(4);
        remoteControl.onButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(5);
    }
}
