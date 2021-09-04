package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD cd = new CD("myCD", "CD", 500,320,200);
        DVD dvd = new DVD("myDVD", "DVD", 1000,423,200);

        cd.writeDataToDisc();
        cd.readDataFromDisc();
        cd.spinDisc();
        cd.pauseDisc();
        cd.stopDisc();

        dvd.writeDataToDisc();
        dvd.readDataFromDisc();
        dvd.spinDisc();
        dvd.pauseDisc();
        dvd.stopDisc();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}