package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.service.BikeService;

@RestController
public class BikeController {
   @Autowired
   BikeService bs;
   @PostMapping("addbike")
   public Bike save(@RequestBody Bike b)
   {
	   return bs.add(b);
   }
   @PostMapping("addbikedetails")
   public List<Bike> saveinfo(@RequestBody List<Bike> b)
   {
	   return bs.adddetails(b);
   }
   @GetMapping("showbikedetails")
   public List<Bike> showinfo()
   {
	   return bs.display();
   }
   @GetMapping("showbikeyear/{year}")
   public List<Bike> showyear(@PathVariable int year)
   {
	   return bs.year(year);
   }
   @GetMapping("showbikeName/{bikeName}")
   public List<Bike> showbikeName(@PathVariable String bikeName)
   {
	   return bs.bikeName(bikeName);
   }
   @GetMapping("showyeardetails/{year}/shownamedetails/{bikeName}")
   public List<Bike> showdetails(@PathVariable int year,@PathVariable String bikeName)
   {
	   return bs.details(year, bikeName);
   }
}
