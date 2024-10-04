package com.bizna.biznakonnect.repository;

import com.bizna.biznakonnect.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long> {
    List<Business> findByType(String type);
    List<Business> findByOwnerId(Long ownerId);
}