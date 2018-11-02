/*
 * SEMUA HANYA MILIK ALLAH
 * MAHA SUCI ALLAH, SEGALA PUJI BAGI ALLAH, TIDAK ADA TUHAN SELAIN ALLAH, MAHA BESAR ALLAH
 * TIDAK ADA DAYA DAN UPAYA KECUALI DENGAN PERTOLONGAN ALLAH
 */
package asia.praxislabs.oopc.service;

/**
 *
 * @author jp
 */
public interface BiCycle {

	//  wheel revolutions per minute
	void changeCadence(int newValue);

	void changeGear(int newValue);

	void speedUp(int increment);

	void applyBrakes(int decrement);
}
