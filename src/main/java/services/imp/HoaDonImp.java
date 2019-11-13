package services.imp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import daos.HoaDonDAO;
import entities.HoaDon;
import services.HoaDonServices;

public class HoaDonImp extends UnicastRemoteObject implements HoaDonServices{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HoaDonDAO hoaDonDAO;
	public HoaDonImp() throws RemoteException{
		hoaDonDAO = new HoaDonDAO();
	}
	public List<HoaDon> danhsachHoaDon() throws RemoteException {
		return hoaDonDAO.danhsachHoaDon();
	}

}
