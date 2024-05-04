package org.com.estatemate.repositories;

import java.util.List;

import org.com.estatemate.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

    List<Application> findAllByProperty_Id(Long propertyId);

    List<Application> findByPropertyAndStatus(Long propertyId, Application.ApplicationStatus status);
}
