package com.jony.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jony.dao.PupilsDao;
import com.jony.model.Pupils;
import com.jony.sevice.PupilsService;
@Service
public class PupilsServiceImpl implements PupilsService {
	@Autowired
	private PupilsDao pupilsDao;
	
	@Transactional
	public void add(Pupils pupils) {
		pupilsDao.add(pupils);
	}

	@Autowired
	@Transactional
	public void edit(Pupils pupils) {
		pupilsDao.edit(pupils);
	}

	@Transactional
	public void delete(int pupilsId) {
		pupilsDao.delete(pupilsId);
	}

	@Transactional
	public Pupils getPupils(int pupilsId) {
		return pupilsDao.getPupils(pupilsId);
	}

	@SuppressWarnings("rawtypes")
	@Transactional
	public List getAllPupils() {
		return pupilsDao.getAllPupils();
	}

}
