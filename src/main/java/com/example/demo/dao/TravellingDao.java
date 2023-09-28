package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.TravellingModel;

//namana
	@Repository
	public interface TravellingDao extends JpaRepository<TravellingModel,Integer> {
		Iterable<TravellingModel> findBySourceAndDestination(String source, String destination);
	}

