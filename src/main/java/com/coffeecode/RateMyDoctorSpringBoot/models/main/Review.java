package com.coffeecode.RateMyDoctorSpringBoot.models.main;

import com.coffeecode.RateMyDoctorSpringBoot.models.main.Doctor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ammar on 10/20/17.
 */
@Entity
@Data
public class Review {

    @Id
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date visitDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    private Integer paidAmount;

    private String remarks;

    @ManyToOne
    private Doctor patient;

    private Date visitEndDate;


}
