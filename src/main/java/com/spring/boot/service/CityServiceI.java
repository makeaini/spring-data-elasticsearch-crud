package com.spring.boot.service;

import com.spring.boot.pojo.City;

import java.util.List;

/**
 * Created by shining on 2017-7-27.
 */
public interface CityServiceI {
    public List<City> searchCity(Integer pageNumber, Integer pageSize, String searchContent);
}
