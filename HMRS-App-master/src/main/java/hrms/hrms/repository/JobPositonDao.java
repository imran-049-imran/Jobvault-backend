package hrms.hrms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.model.JobPosition;

public interface JobPositonDao extends JpaRepository<JobPosition, Integer> {
   
	Optional<JobPosition> findByTitle(String title);


}
