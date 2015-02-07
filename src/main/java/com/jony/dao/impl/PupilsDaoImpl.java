package com.jony.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jony.dao.PupilsDao;
import com.jony.model.Pupils;

@Repository
public class PupilsDaoImpl implements PupilsDao {
	@Autowired
	private SessionFactory session;
	@Override
	public void add(Pupils pupils) {
		session.getCurrentSession().save(pupils);
	}

	@Override
	public void edit(Pupils pupils) {
		session.getCurrentSession().update(pupils);;
	}

	@Override
	public void delete(int pupilsId) {
		
		session.getCurrentSession().delete(getPupils(pupilsId));
	}

	@Override
	public Pupils getPupils(int pupilsId) {
		
		return (Pupils)session.getCurrentSession().get(Pupils.class, pupilsId);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getAllPupils() {
		
		return session.getCurrentSession().createQuery("from Pupils").list();
	}

}
