package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer>{
	
	@Query(value="select * from biketable where year=:a",nativeQuery=true)
	public List<Bike> yearinfo(@Param("a") int year);
	
	@Query(value="select * from biketable where bike_name=:b",nativeQuery=true)
	public List<Bike> bikeNameinfo(@Param("b") String bike_name);
	
	@Query(value="select * from biketable where year=:a and bike_name=:b",nativeQuery=true)
	public List<Bike> detailsinfo(@Param("a") int year,@Param("b") String bike_name);

}
