package com.example.registerlogin.Repo;

import com.example.registerlogin.Entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDetails,Integer> {
	Optional<EmployeeDetails> findOneByEmailAndPassword(String email, String password);
	EmployeeDetails findByEmail(String email);
}
