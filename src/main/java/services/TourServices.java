package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entities.ChiTietTour;
import entities.Tour;

public interface TourServices extends Remote{
	public boolean themTour(Tour tour, ChiTietTour chiTietTour) throws RemoteException;
	public boolean xoaTour(Tour tour) throws RemoteException;
	public boolean suaTour(Tour tour) throws RemoteException;
	public List<Tour> danhsachTour() throws RemoteException;
}
