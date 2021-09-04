package org.launchcode.studio7;

public abstract class BaseDisc {

    private String discName;
    private String discType;
    private final double discStorage;
    private double availableStorage;
    private double RPM;


    public BaseDisc(String discName, String discType, double discStorage,double availableStorage, double RPM) {
        this.discName = discName;
        this.discType = discType;
        this.discStorage = discStorage;
        this.availableStorage= availableStorage;
        this.RPM = RPM;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public double getDiscStorage() {
        return discStorage;
    }

    public double getAvailableStorage() {
        return availableStorage;
    }

    public void setAvailableStorage(double availableStorage) {
        this.availableStorage = availableStorage;
    }

    public double getRPM() {
        return RPM;
    }

    public void setRPM(double RPM) {
        this.RPM = RPM;
    }
}