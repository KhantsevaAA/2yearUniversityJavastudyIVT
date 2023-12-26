package org.example.lab2.task3;

class BridgeService {
    public static void main(String [] args) {
        testDevice(new Tv());        
        anothertestDevice(new Radio());
    }

    static private void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        
    }
     static private void anothertestDevice(Device device) {
        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.mute();
        device.printStatus();
     }
}