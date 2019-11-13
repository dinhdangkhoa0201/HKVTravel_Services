package services.imp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import daos.TourDAO;
import entities.ChiTietTour;
import entities.Tour;
import services.TourServices;

public class TourImp extends UnicastRemoteObject implements TourServices{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TourDAO tourDAO;
	public TourImp() throws RemoteException{
		tourDAO = new TourDAO();
	}
	public boolean themTour(Tour tour, ChiTietTour chiTietTour) throws RemoteException {
		return tourDAO.themTour(tour, chiTietTour);
	}

	public boolean xoaTour(Tour tour) throws RemoteException {
		return tourDAO.xoaTour(tour);
	}

	public boolean suaTour(Tour tour) throws RemoteException {
		return tourDAO.suaTour(tour);
	}

	public List<Tour> danhsachTour() throws RemoteException {
		return tourDAO.danhsachTour();
	}

}
