package com.ceshop.dao;

import com.ceshop.domain.Progress;

public interface ProgressDao extends GenericDao<Progress> {
	Progress getProgressByUserIdTestId(Integer userId, Integer testId);
}
