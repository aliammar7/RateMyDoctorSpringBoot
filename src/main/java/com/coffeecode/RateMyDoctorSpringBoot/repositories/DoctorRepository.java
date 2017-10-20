package com.coffeecode.RateMyDoctorSpringBoot.repositories;

import com.coffeecode.RateMyDoctorSpringBoot.models.main.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ammar on 10/21/17.
 */
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

}
