package com.f1analyzer.f1_race_analyzer.controller;

import com.f1analyzer.f1_race_analyzer.model.DriverInfo;
import com.f1analyzer.f1_race_analyzer.service.OpenF1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/f1")
public class F1Controller {

    @Autowired
    private OpenF1Service openF1Service;

    @GetMapping("/drivers")
    public List<DriverInfo> getDrivers(@RequestParam(required = false) String team) {
        return Arrays.stream(openF1Service.getLatestDrivers())
                .filter(d -> team == null || d.getTeam_name().equalsIgnoreCase(team))
                .collect(Collectors.toList());
    }

    @GetMapping("/drivers/number/{num}")
    public DriverInfo getDriverByNumber(@PathVariable int num) {
        return openF1Service.getDriverByNumber(num);
    }
}