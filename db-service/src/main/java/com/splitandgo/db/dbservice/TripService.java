package com.splitandgo.db.dbservice;

import java.util.List;

import com.splitandgo.domain.Trip;


public interface TripService {

	public void save(Trip trip);
	
	public Trip update(Trip trip);
	
	public void delete(Long id);

	public List<Trip> findAll();

	public Trip findOne(Long id);

}
