package com.addition;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.slf4j.Logger;
import org.apache.ws.axis2.AdditionnerStub;
import org.apache.ws.axis2.AdditionnerStub.Addition;
import org.apache.ws.axis2.AdditionnerStub.AdditionResponse;
import org.slf4j.LoggerFactory;

public class Repo implements IRepo{

	Logger LOG = LoggerFactory.getLogger(Repo.class);
	
	public int serviceAdd(int x, int y){
		int resultat = 0;
		try {
			AdditionnerStub addition = new AdditionnerStub();
			Addition arg0 = new Addition();
			arg0.setX(x);
			arg0.setY(y);
			AdditionResponse response = addition.addition(arg0);
			resultat = (int) response.get_return();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			LOG.error(e.toString());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			LOG.error(e.toString());
		}
		return resultat;
	}
}
