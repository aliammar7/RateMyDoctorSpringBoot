package com.coffeecode.RateMyDoctorSpringBoot.models.config;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ammar on 10/21/17.
 */
@Entity
@Data
public class MainConfig implements Serializable{

    @Id
    private Long id;
}
