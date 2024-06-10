package com.example.controller;

import org.openapitools.api.TimeMeasurementsApi;
import org.openapitools.model.MethodInfoDto;
import org.openapitools.model.TimeMeasurementDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("${base-url}")
public class TimeMeasurementController implements TimeMeasurementsApi {

    @Override
    public ResponseEntity<List<TimeMeasurementDto>> getLogMethodExecutionTime(LocalDateTime from, LocalDateTime to, Integer page, Integer size, String sort) {
        return new ResponseEntity<>(getMeasurements(), HttpStatus.OK);
    }

    private List<TimeMeasurementDto> getMeasurements() {
        var methodInfo = new MethodInfoDto();
        methodInfo.setClassName("com.example.timetracker.service.impl.DefaultFooBarService");
        methodInfo.setMethodName("foo");
        methodInfo.setSignatureShortName("DefaultFooBarService.foo()");
        methodInfo.setSignatureLongName("public void com.example.timetracker.service.impl.DefaultFooBarService.foo()");

        var measurement = new TimeMeasurementDto();
        measurement.setMethodInfo(methodInfo);
        measurement.setExecutionTime(1508034900L);
        measurement.createdAt(LocalDateTime.now());

        List<TimeMeasurementDto> measurements = new ArrayList();
        measurements.add(measurement);
        return measurements;
    }

}
