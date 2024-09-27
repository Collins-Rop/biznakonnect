package com.bizna.biznakonnect.service;

import com.bizna.biznakonnect.model.Business;

import java.util.List;
import java.util.Optional;

public interface BusinessService {
    Business createBusiness(Business business);
    Optional<Business> getBusinessById(Long id);
    List<Business> getAllBusinesses();
    List<Business> getBusinessesByType(String type);
    List<Business> getBusinessesByOwnerId(Long ownerId);
    Business updateBusiness(Business business);
    void deleteBusiness(Long id);
}