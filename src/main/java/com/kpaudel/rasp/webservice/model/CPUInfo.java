package com.kpaudel.rasp.webservice.model;

public class CPUInfo {
	private float temperature;
	private float frequency;
	private float coreVoltage;

	public CPUInfo() {
		this.temperature = 0;
		this.frequency = 0;
		this.coreVoltage = 0;
	}

	public CPUInfo(float temperature, float frequency, float coreVoltage) {
		this.temperature = temperature;
		this.frequency = frequency;
		this.coreVoltage = coreVoltage;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getFrequency() {
		return frequency;
	}

	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}

	public float getCoreVoltage() {
		return coreVoltage;
	}

	public void setCoreVoltage(float coreVoltage) {
		this.coreVoltage = coreVoltage;
	}

}
