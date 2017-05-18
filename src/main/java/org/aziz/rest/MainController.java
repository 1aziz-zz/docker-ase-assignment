package org.aziz.rest;

import org.aziz.model.Device;
import org.aziz.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by aziz on 5/18/17.
 */
@RestController
public class MainController {
    @Autowired
    private DeviceService deviceService;

    @RequestMapping(value = "/")
    public List<Device> getAll() {
        return deviceService.getAll();
    }
}
