package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entities.HoaDon;

public interface HoaDonServices extends Remote{
	public List<HoaDon> danhsachHoaDon() throws RemoteException;
}
