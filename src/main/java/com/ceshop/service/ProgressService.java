package com.ceshop.service;

import com.ceshop.domain.Progress;

public interface ProgressService {
	public Progress getProgressByUserIdTestId(Integer userId, Integer testId);
}
