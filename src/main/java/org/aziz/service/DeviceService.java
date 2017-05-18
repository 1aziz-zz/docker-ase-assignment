package org.aziz.service;

import org.aziz.model.Brand;
import org.aziz.model.Device;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by aziz on 5/12/17.
 */
@Service
public class DeviceService implements AppService<Device> {


    public DeviceService() {

    }

    List<Device> getDevicesByType(Brand brand) {
        return null;
    }

    List<Device> getDevicesByModelYear(int year) {
        return null;
    }

    @Override
    public List<Device> getAll() {
        return this.createData();
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void add(Device object) {

    }

    @Override
    public void delete(Device object) {

    }

/*
    public void java8Examples() {
        String result = devices.stream().findFirst().toString();
        System.out.println(result);
    }*/

    public List<Device> createData() {
        List<Device> devices;

        devices = Arrays.asList(
                new Device(Brand.Apple, "iPhone 8", 2017),
                new Device(Brand.Apple, "iPhone 8 Plus", 2017),
                new Device(Brand.Apple, "iPhone 7", 2016),
                new Device(Brand.Samsung, "Galaxy S8", 2017),
                new Device(Brand.Samsung, "Galaxy S7", 2016));
        return devices;
    }
}
