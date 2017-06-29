package com.ceshop.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ceshop.dao.ProgressDao;
import com.ceshop.domain.Progress;
@SuppressWarnings("unchecked")
@Repository
public class ProgressDaoImpl extends GenericDaoImpl<Progress> implements ProgressDao{
    

	@Override
	public Progress getProgressByUserIdTestId(Integer userId, Integer testId) {
		// Example query using hibernate entityManager
		// Query query = entityManager.createQuery(select progress from ProgressTable pt where pt.userId = :userId and pt.testId = :testId );
		// query.setParameter("userId", userId.toString());
		// query.setParameter("testId", testId.toString());
		return new Progress((int)Math.round((Math.random()*100)), userId, testId);
	}

}
