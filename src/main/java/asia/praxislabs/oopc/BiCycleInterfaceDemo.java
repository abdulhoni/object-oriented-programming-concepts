/*
 * SEMUA HANYA MILIK ALLAH
 * MAHA SUCI ALLAH, SEGALA PUJI BAGI ALLAH, TIDAK ADA TUHAN SELAIN ALLAH, MAHA BESAR ALLAH
 * TIDAK ADA DAYA DAN UPAYA KECUALI DENGAN PERTOLONGAN ALLAH
 */
package asia.praxislabs.oopc;

import asia.praxislabs.oopc.service.impl.BiCycleImpl;

/**
 *
 * @author jp
 */
public class BiCycleInterfaceDemo {
	
	private static BiCycleImpl biCycleImpl = new BiCycleImpl();

	public static void main(String[] args) {

//		biCycleImpl.applyBrakes(2);
//		biCycleImpl.changeCadence(3);
//		biCycleImpl.changeGear(4);
		biCycleImpl.changeGear(5);
		biCycleImpl.printStates();
	}
}
