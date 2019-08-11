package com.example.property.property.service;

import com.example.property.property.repo.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    @Value("${some.bar.value}")
    private String name;

    @Autowired
    private PropertyRepo repo;


//    @PostConstruct
    public void call(){
        getVal();
    }

    public void getVal(){
        System.out.println("============= printing value for : " + name);
        String properties = repo.getProperties();
        System.out.println(properties);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
