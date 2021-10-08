package de.mindmatters.kennenlerntag.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 *
 * @author Nils Knudsen
 * @since 08.10.21
 **/
@Entity
public class MeasuredValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Min(value = 0)
    @Max(value = 900)
    private Integer measuredValue;

    public MeasuredValue(Integer measuredValue) {
        this.measuredValue = measuredValue;
    }

    public MeasuredValue() {
    }

}
