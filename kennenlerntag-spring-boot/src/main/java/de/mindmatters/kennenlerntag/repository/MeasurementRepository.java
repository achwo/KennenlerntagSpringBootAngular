package de.mindmatters.kennenlerntag.repository;

import de.mindmatters.kennenlerntag.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nils Knudsen
 * @since 08.10.21
 **/
public interface MeasurementRepository extends JpaRepository<Measurement, String> {
}
