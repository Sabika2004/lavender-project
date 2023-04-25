package com.Lavender.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Lavender.demo.Model.LavenderModel;

@Repository
public interface LavenderRepository extends JpaRepository<LavenderModel,String>{

}
