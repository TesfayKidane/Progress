package com.ceshop.serviceimpl;

import com.ceshop.dao.ProgressDao;
import com.ceshop.daoimpl.ProgressDaoImpl;
import com.ceshop.domain.Progress;
import com.ceshop.service.ProgressService;

public class ProgressServiceImpl implements ProgressService{

	ProgressDao pDao = new ProgressDaoImpl();
	@Override
	public Progress getProgressByUserIdTestId(Integer userId, Integer testId) {
			return pDao.getProgressByUserIdTestId(userId, testId);
	}

}
