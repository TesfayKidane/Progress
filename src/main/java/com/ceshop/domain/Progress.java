package com.ceshop.domain;

public class Progress {
	private int progressInPercent;
    private int userId;
    private int testId;
    

	public Progress(int progressInPercent, int userId, int testId) {
		super();
		this.progressInPercent = progressInPercent;
		this.userId = userId;
		this.testId = testId;
	}

	public int getProgressInPercent() {
		return progressInPercent;
	}

	public void setProgressInPercent(int progressInPercent) {
		this.progressInPercent = progressInPercent;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	@Override
	public String toString() {
		return "Progress [progressInPercent=" + progressInPercent + " % , userId=" + userId + ", testId=" + testId + "]";
	}

	
}
