package com.Lavender.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Lavender.demo.Model.LavenderModel;
import com.Lavender.demo.repository.LavenderRepository;

@RestController
public class LavenderController {
@Autowired

LavenderRepository one;
@GetMapping("/getLav")
public List<LavenderModel>getAllInfo()
{
	return one.findAll();
}

@GetMapping("/getLav/{Itemname}")
public LavenderModel getdetailsbyString(@PathVariable String Itemname)
{
	return one.findById(Itemname).orElse(null);
}
@PostMapping("/postLav")
public String saveid(@RequestBody LavenderModel Itemname)
{
	one.save(Itemname);
	return "saved";
}
@PutMapping("/putLav")
public LavenderModel updateId(@RequestBody LavenderModel size)
{
	return one.save(size);

}
@DeleteMapping("/deleteLav/{Itemname}")
public String deletebyId(@PathVariable String Itemname)

{
   one.deleteById(Itemname);
   return "deleted";
}

}

 
  