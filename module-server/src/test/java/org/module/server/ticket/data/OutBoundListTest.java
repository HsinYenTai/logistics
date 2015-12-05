package org.module.server.ticket.data;

import java.rmi.RemoteException;

import junit.framework.TestCase;

import org.module.common.po.OutBoundListPO;
import org.module.common.po.State;
import org.module.server.data.ticketData.OutBoundListDataImpl;

public class OutBoundListTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testUpdate() {
		try {
			OutBoundListDataImpl data = new OutBoundListDataImpl();
			OutBoundListPO po = new OutBoundListPO("courier","date","destination",
					"car","tansportListId",State.UNPASS);
			data.add(po);
			OutBoundListPO s = data.getByState(State.UNPASS).get(0);
			boolean a =s.toString().equals(po.toString());
			assert(a);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
