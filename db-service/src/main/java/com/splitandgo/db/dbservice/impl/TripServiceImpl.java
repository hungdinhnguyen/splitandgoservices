package com.splitandgo.db.dbservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.splitandgo.db.dao.TripDao;
import com.splitandgo.db.dbservice.TripService;
import com.splitandgo.domain.Trip;


@Service
@Transactional
public class TripServiceImpl implements TripService {

	@Autowired
	private TripDao tripDao;

	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	//@Logging
	public void save(Trip trip) {
		// member is detached during creating a new trip
		tripDao.update(trip);
	}

	public List<Trip> findAll() {
		return (List<Trip>) tripDao.findAll();
	}

	public Trip findOne(Long id) {
		return tripDao.findOne(id);
	}

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@Logging
	public Trip update(Trip trip) {
		return tripDao.update(trip);
	}

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@Logging
	public void delete(Long id) {
		tripDao.delete(id);
	}

}
