package de.mindmatters.kennenlerntag.repository;

import de.mindmatters.kennenlerntag.model.Measurement;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Nils Knudsen
 * @since 08.10.21
 **/
public interface MeasurementRepository extends CrudRepository<Measurement, String> {
}
