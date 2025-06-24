package com.f1analyzer.f1_race_analyzer.service;

import com.f1analyzer.f1_race_analyzer.model.DriverInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Service
public class OpenF1Service {

    public DriverInfo[] getLatestDrivers() {
        String url = "https://api.openf1.org/v1/drivers?session_key=latest";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return restTemplate.getForObject(url, DriverInfo[].class);
    }

    public DriverInfo getDriverByNumber(int driverNumber) {
        DriverInfo[] drivers = getLatestDrivers();
        for (DriverInfo driver : drivers) {
            if (driver.getDriver_number() == driverNumber) {
                return driver;
            }
        }
        return null; // Not found
    }
}