package com.bizna.biznakonnect.service;

import com.bizna.biznakonnect.model.Business;
import com.bizna.biznakonnect.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessServiceImpl implements BusinessService {

    private final BusinessRepository businessRepository;

    @Autowired
    public BusinessServiceImpl(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    @Override
    public Business createBusiness(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public Optional<Business> getBusinessById(Long id) {
        return businessRepository.findById(id);
    }

    @Override
    public List<Business> getAllBusinesses() {
        return businessRepository.findAll();
    }

    @Override
    public List<Business> getBusinessesByType(String type) {
        return businessRepository.findByType(type);
    }

    @Override
    public List<Business> getBusinessesByOwnerId(Long ownerId) {
        return businessRepository.findByOwnerId(ownerId);
    }

    @Override
    public Business updateBusiness(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public void deleteBusiness(Long id) {
        businessRepository.deleteById(id);
    }
}