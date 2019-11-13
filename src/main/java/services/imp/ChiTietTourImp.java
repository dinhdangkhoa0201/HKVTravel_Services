package services.imp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import daos.ChiTietTourDAO;
import entities.ChiTietTour;
import services.ChiTietTourServices;

public class ChiTietTourImp extends UnicastRemoteObject implements ChiTietTourServices{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ChiTietTourDAO chiTietTourDAO ;
	public ChiTietTourImp() throws RemoteException{
		chiTietTourDAO = new ChiTietTourDAO();
	}
	
	public ChiTietTour timChiTietTour(String maTour) throws RemoteException {
		return chiTietTourDAO.timChiTietTour(maTour);
	}
}
