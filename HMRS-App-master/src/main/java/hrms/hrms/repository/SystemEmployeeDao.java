package hrms.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.model.SystemEmployee;

public interface SystemEmployeeDao extends JpaRepository<SystemEmployee, Integer> {

}
