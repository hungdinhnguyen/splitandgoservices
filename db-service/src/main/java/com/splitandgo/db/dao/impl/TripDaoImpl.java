package com.splitandgo.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.splitandgo.db.dao.TripDao;
import com.splitandgo.domain.Trip;


@Repository
public class TripDaoImpl extends GenericDaoImpl<Trip> implements TripDao {

	public TripDaoImpl() {
		super.setDaoType(Trip.class);
	}

}