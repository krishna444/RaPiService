package com.kpaudel.rasp.webservice;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpaudel.rasp.webservice.model.CPUInfo;
import com.kpaudel.rasp.webservice.model.MemoryInfo;
import com.pi4j.system.SystemInfo;

@RestController
//@RequestMapping("/rest")
public class SystemInfoController {
	@RequestMapping("/cpu")
	public CPUInfo getCPUTemperature() {
		CPUInfo cpuInfo = new CPUInfo();
		try {
			cpuInfo.setTemperature(SystemInfo.getCpuTemperature());
			cpuInfo.setFrequency(SystemInfo.getClockFrequencyArm());
			cpuInfo.setCoreVoltage(SystemInfo.getCpuVoltage());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return cpuInfo;
	}

	@RequestMapping("/memory")
	public MemoryInfo getMemoryInfo() {
		MemoryInfo memoryInfo = new MemoryInfo();
		try {
			memoryInfo.setFreeMemory(SystemInfo.getMemoryFree());
			memoryInfo.setTotalMemory(SystemInfo.getMemoryTotal());
			memoryInfo.setUsedMemory(SystemInfo.getMemoryUsed());
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return memoryInfo;

	}

}
