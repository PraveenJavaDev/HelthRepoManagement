package com.health.information.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.health.information.model.PersonRegistration;

@Repository
public interface UserRepository extends JpaRepository<PersonRegistration, Integer> {

}
