package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String discName, String discType, double discStorage ,double availableStorage, double RPM) {
        super(discName, discType, discStorage,availableStorage,RPM);
    }


    @Override
    public void spinDisc() {
        System.out.println("CD is spinning");
    }

    @Override
    public void pauseDisc() {
        System.out.println("CD is paused");
    }

    @Override
    public void stopDisc() {
        System.out.println("CD is stopped");
    }

    @Override
    public void readDataFromDisc() {
        System.out.println("CD is being read");
    }

    @Override
    public void writeDataToDisc() {
        System.out.println("Info loading onto CD");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}