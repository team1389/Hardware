package com.team1389.hardware.control;

import com.team1389.hardware.interfaces.inputs.SpeedInput;

import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;

public class PIDSpeedInput implements PIDSource{
	SpeedInput sensor;
	
	public PIDSpeedInput(SpeedInput sensor) {
		this.sensor = sensor;
	}

	@Override
	public void setPIDSourceType(PIDSourceType pidSource) {
		if (!pidSource.equals(PIDSourceType.kRate)){
			throw new UnsupportedOperationException("PIDSpeedInput is not able to become anything besides a speed input");
		}
	}

	@Override
	public PIDSourceType getPIDSourceType() {
		return PIDSourceType.kRate;
	}

	@Override
	public double pidGet() {
		return sensor.getSpeed();
	}

}
