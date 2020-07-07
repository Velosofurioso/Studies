package com.studies.webservice_springboot_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studies.webservice_springboot_jpa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
