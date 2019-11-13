package services;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entities.ChiTietTour;

public interface ChiTietTourServices extends Remote{
	public ChiTietTour timChiTietTour(String maTour) throws RemoteException;
}
