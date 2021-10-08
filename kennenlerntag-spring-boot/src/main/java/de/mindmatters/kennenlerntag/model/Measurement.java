package de.mindmatters.kennenlerntag.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Model for Measurements
 *
 * @author Nils Knudsen
 * @since 08.10.21
 **/
@Entity
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToMany
    @Size(max = 3)
    private List<MeasuredValue> measuredValues = new ArrayList<>();


}
