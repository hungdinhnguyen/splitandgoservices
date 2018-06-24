package com.splitandgo.db.dbservice;

import java.util.List;

import com.splitandgo.domain.Notification;


public interface NotificationService {
	
	public void save(Notification notification);

	public List<Notification> findAll();

	public Notification findOne(Long id);

}
