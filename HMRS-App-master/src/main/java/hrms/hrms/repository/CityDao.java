package hrms.hrms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.model.City;

public interface CityDao extends JpaRepository<City,Integer> {
    Optional<City> findByCityName(String cityName);


}
