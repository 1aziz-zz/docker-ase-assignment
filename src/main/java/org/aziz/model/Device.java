package org.aziz.model;

/**
 * Created by aziz on 5/12/17.
 */
public class Device {
    private Brand deviceBrand;
    private String title;
    private int modelYear;

    public Device(Brand deviceBrand, String title, int modelYear) {
        this.deviceBrand = deviceBrand;
        this.title = title;
        this.modelYear = modelYear;
    }

    public Brand getDeviceBrand() {
        return deviceBrand;
    }

    public String getTitle() {
        return title;
    }

    public int getModelYear() {
        return modelYear;
    }
}
