package de.mindmatters.kennenlerntag.repository;

import de.mindmatters.kennenlerntag.model.MeasuredValue;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Nils Knudsen
 * @since 08.10.21
 **/
public interface MeasuredValueRepository extends CrudRepository<MeasuredValue, String> {
}
