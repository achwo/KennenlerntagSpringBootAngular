package de.mindmatters.kennenlerntag.service;

import de.mindmatters.kennenlerntag.model.MeasuredValue;
import de.mindmatters.kennenlerntag.model.Measurement;
import de.mindmatters.kennenlerntag.repository.MeasuredValueRepository;
import de.mindmatters.kennenlerntag.repository.MeasurementRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service for working with our delivered measurements
 *
 * @author Nils Knudsen
 * @since 08.10.21
 **/
@Service
public class MeasurementService {

    MeasurementRepository measurementRepository;

    MeasuredValueRepository measuredValueRepository;

    public MeasurementService(MeasurementRepository measurementRepository, MeasuredValueRepository measuredValueRepository) {
        this.measurementRepository = measurementRepository;
        this.measuredValueRepository = measuredValueRepository;
    }

    public ResponseEntity<String> saveMeasurementToRepository(List<Integer> measuredValues){

        List<MeasuredValue> valueList = new ArrayList<>();

        for(Integer measuredValue : measuredValues) {

            MeasuredValue mesVal = new MeasuredValue(measuredValue);
            measuredValueRepository.save(mesVal);
            valueList.add(mesVal);
        }

        Measurement measurement = new Measurement(valueList);

        measurementRepository.save(measurement);
        return ResponseEntity.ok("Saved.");
    }

    public ResponseEntity<List<Measurement>> getAllMeasurementsForResponse(){
        List<Measurement> all = measurementRepository.findAll();
        return ResponseEntity.ok(all);
    }
}
