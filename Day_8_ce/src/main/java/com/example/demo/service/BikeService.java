package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepo;

@Service
public class BikeService {
  @Autowired
  BikeRepo br;
  public Bike add(Bike b)
  {
	  return br.save(b);
  }
  public List<Bike> adddetails(List<Bike> b)
  {
	  return br.saveAll(b);
  }
  public List<Bike> display()
  {
	  return br.findAll();
  }
  public List<Bike> year(int year)
  {
	  return br.yearinfo(year);
  }
  public List<Bike> bikeName(String bike_name)
  {
	  return br.bikeNameinfo(bike_name);
  }
  public List<Bike> details(int year,String bike_name)
  {
	  return br.detailsinfo(year, bike_name);
  }
}
