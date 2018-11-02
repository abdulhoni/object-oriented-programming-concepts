/*
 * SEMUA HANYA MILIK ALLAH
 * MAHA SUCI ALLAH, SEGALA PUJI BAGI ALLAH, TIDAK ADA TUHAN SELAIN ALLAH, MAHA BESAR ALLAH
 * TIDAK ADA DAYA DAN UPAYA KECUALI DENGAN PERTOLONGAN ALLAH
 */
package asia.praxislabs.oopc.domain;

/**
 *
 * @author jp
 */
public class Bicycle {

	int cadence = 0;
	int speed = 0;
	int gear = 1;

	public void changeCadence(int newValue) {
		cadence = newValue;
	}

	public void changeGear(int newValue) {
		gear = newValue;
	}

	public void speedUp(int increment) {
		speed = speed + increment;
	}

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
