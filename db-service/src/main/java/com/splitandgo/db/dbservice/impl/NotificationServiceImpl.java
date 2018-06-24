package com.splitandgo.db.dbservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.splitandgo.db.dao.NotificationDao;
import com.splitandgo.db.dbservice.NotificationService;
import com.splitandgo.domain.Notification;


@Service
@Transactional
public class NotificationServiceImpl implements NotificationService {
	
	@Autowired
	private NotificationDao notificationDao;

	@Override
	public void save(Notification notification) {
		notificationDao.save(notification);
		
	}

	@Override
	public List<Notification> findAll() {
		return notificationDao.findAll();
	}

	@Override
	public Notification findOne(Long id) {
		// TODO Auto-generated method stub
		return notificationDao.findOne(id);
	}

}
