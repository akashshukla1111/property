package com.example.property.property.service;

import com.example.property.property.repo.PropertyRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {PropertyService.class})
public class PropertyServiceTest {

    @Autowired
    private PropertyService propertyService;

    @MockBean
    PropertyRepo repo;


    @Before
    public void setUp() {
        Mockito.when(repo.getProperties()).thenReturn("nothign is ");
//        ReflectionTestUtils.setField(propertyService, "name", "abhishek");
    }

    @Test
    public void test() {
        propertyService.getVal();
    }

}