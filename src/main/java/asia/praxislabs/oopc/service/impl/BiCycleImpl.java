/*
 * SEMUA HANYA MILIK ALLAH
 * MAHA SUCI ALLAH, SEGALA PUJI BAGI ALLAH, TIDAK ADA TUHAN SELAIN ALLAH, MAHA BESAR ALLAH
 * TIDAK ADA DAYA DAN UPAYA KECUALI DENGAN PERTOLONGAN ALLAH
 */
package asia.praxislabs.oopc.service.impl;

import asia.praxislabs.oopc.service.BiCycle;

/**
 *
 * @author jp
 */
public class BiCycleImpl implements BiCycle {

	int cadence = 0;
	int speed = 0;
	int gear = 1;

	// The compiler will now require that methods
	// changeCadence, changeGear, speedUp, and applyBrakes
	// all be implemented. Compilation will fail if those
	// methods are missing from this class.
	@Override
	public void changeCadence(int newValue) {
		cadence = newValue;
	}

	@Override
	public void changeGear(int newValue) {
		gear = newValue;
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println(
			"cadence:" + cadence
			+ " speed:" + speed
			+ " gear:" + gear
		);
	}
}
