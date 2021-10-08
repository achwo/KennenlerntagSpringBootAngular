package de.mindmatters.kennenlerntag.repository;

import de.mindmatters.kennenlerntag.model.MeasuredValue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nils Knudsen
 * @since 08.10.21
 **/
public interface MeasuredValueRepository extends JpaRepository<MeasuredValue, String> {
}
