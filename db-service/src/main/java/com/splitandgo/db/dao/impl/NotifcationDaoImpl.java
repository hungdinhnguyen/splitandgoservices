package com.splitandgo.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.splitandgo.db.dao.NotificationDao;
import com.splitandgo.db.domain.Notification;


@Repository
public class NotifcationDaoImpl extends GenericDaoImpl<Notification> implements NotificationDao {

	public NotifcationDaoImpl() {
		super.setDaoType(Notification.class);
	}
}
