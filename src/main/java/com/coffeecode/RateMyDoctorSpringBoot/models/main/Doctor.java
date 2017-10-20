package com.coffeecode.RateMyDoctorSpringBoot.models.main;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by Ammar on 10/13/17.
 */
@Entity
@Data
public class Doctor implements Serializable {


    @Id
    @SequenceGenerator(name = "doctor_seq", sequenceName = "doctor_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctor_seq")
    private Long id;

    @NotNull
    private String firstName;

    private String midName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Temporal(TemporalType.DATE)
    private Date creationDate;

    @Length(max = 20)
    private String phoneNumber;

    private String address;

    @Email
    private String email;

    @OneToMany(mappedBy = "doctor", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Review> reviews;


    private String sex;
    private String nationality;
    private String occupation;


}
