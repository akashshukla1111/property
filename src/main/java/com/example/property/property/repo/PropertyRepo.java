package com.example.property.property.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PropertyRepo {

    @Autowired
    private TestRepo testRepo;

    public String getProperties() {
        System.out.println("this is repo ");
        testRepo.test();
        return "test is repo";

    }
}
