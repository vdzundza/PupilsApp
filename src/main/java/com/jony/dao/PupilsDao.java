package com.jony.dao;

import java.util.List;

import com.jony.model.Pupils;

public interface PupilsDao {
			public void add(Pupils pupils);
			public void edit(Pupils pupils);
			public void delete(int pupilsId);
			public Pupils getPupils(int pupilsId);
			@SuppressWarnings("rawtypes")
			public List getAllPupils();
}
