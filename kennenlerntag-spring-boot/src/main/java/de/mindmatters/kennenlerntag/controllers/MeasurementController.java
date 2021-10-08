package de.mindmatters.kennenlerntag.controllers;

import de.mindmatters.kennenlerntag.service.MeasurementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MeasurementController {

    private MeasurementService measurementService;

    public MeasurementController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @PostMapping(value = "/measurement")
    public ResponseEntity<String> uploadMeasurementData(@RequestBody Integer[] measuredValues){
        return measurementService.saveMeasurementToRepository(Arrays.asList(measuredValues));
    }

}
