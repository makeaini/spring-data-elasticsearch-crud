package com.spring.boot.controller;

import com.spring.boot.pojo.City;
import com.spring.boot.service.CityServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by shining on 2017-7-27.
 */
@RestController
public class CityController2 {
    @Autowired
    private CityServiceI cityServiceI;

    @RequestMapping(value = "/api/city/description/find2", method = RequestMethod.GET)
    public List<City> findByDescription(String description) {
        return cityServiceI.searchCity(null,null,description);
    }

}
