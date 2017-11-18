package com.kpaudel.rasp.webservice.model;

public class MemoryInfo {
	private long totalMemory;
	private long usedMemory;
	private long freeMemory;

	public MemoryInfo() {
		this.totalMemory = 0;
		this.usedMemory = 0;
		this.freeMemory = 0;
	}
	

	public long getTotalMemory() {
		return totalMemory;
	}

	public void setTotalMemory(long totalMemory) {
		this.totalMemory = totalMemory;
	}

	public long getUsedMemory() {
		return usedMemory;
	}

	public void setUsedMemory(long usedMemory) {
		this.usedMemory = usedMemory;
	}

	public long getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(long freeMemory) {
		this.freeMemory = freeMemory;
	}

}
