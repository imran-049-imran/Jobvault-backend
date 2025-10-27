package hrms.hrms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.model.Employee;

public interface EmployerDao extends JpaRepository<Employee, Integer> {
    Optional<Employee> findByEmail(String email);

	

}
