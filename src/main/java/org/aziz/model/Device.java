package org.aziz.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Device device;
        device = (Device) o;
        return modelYear == device.modelYear &&
                deviceBrand == device.deviceBrand &&
                Objects.equals(title, device.title);
    }

}
