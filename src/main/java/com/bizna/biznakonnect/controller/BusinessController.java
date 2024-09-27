package com.bizna.biznakonnect.controller;

import com.bizna.biznakonnect.model.Business;
import com.bizna.biznakonnect.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {

    private final BusinessService businessService;

    @Autowired
    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @PostMapping
    public ResponseEntity<Business> createBusiness(@RequestBody Business business) {
        Business createdBusiness = businessService.createBusiness(business);
        return new ResponseEntity<>(createdBusiness, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Business> getBusinessById(@PathVariable Long id) {
        return businessService.getBusinessById(id)
                .map(business -> new ResponseEntity<>(business, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Business>> getAllBusinesses() {
        List<Business> businesses = businessService.getAllBusinesses();
        return new ResponseEntity<>(businesses, HttpStatus.OK);
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<Business>> getBusinessesByType(@PathVariable String type) {
        List<Business> businesses = businessService.getBusinessesByType(type);
        return new ResponseEntity<>(businesses, HttpStatus.OK);
    }

    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<List<Business>> getBusinessesByOwnerId(@PathVariable Long ownerId) {
        List<Business> businesses = businessService.getBusinessesByOwnerId(ownerId);
        return new ResponseEntity<>(businesses, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Business> updateBusiness(@PathVariable Long id, @RequestBody Business business) {
        business.setId(id);
        Business updatedBusiness = businessService.updateBusiness(business);
        return new ResponseEntity<>(updatedBusiness, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBusiness(@PathVariable Long id) {
        businessService.deleteBusiness(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
