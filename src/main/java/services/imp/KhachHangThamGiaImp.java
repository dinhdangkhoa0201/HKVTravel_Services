package services.imp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import daos.KhachHangThamGiaDAO;
import entities.KhachHangThamGia;
import services.KhachHangThamGiaServices;

public class KhachHangThamGiaImp extends UnicastRemoteObject implements KhachHangThamGiaServices{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private KhachHangThamGiaDAO khachHangThamGiaDAO;
	public KhachHangThamGiaImp() throws RemoteException{
		khachHangThamGiaDAO = new KhachHangThamGiaDAO();
	}
	public boolean themKhachHangThamGia(KhachHangThamGia khachHangThamGia) throws RemoteException {
		return khachHangThamGiaDAO.themKhachHangThamGia(khachHangThamGia);
	}

	public List<KhachHangThamGia> danhsachKhachHangThamGia(String maHD) throws RemoteException {
		return khachHangThamGiaDAO.danhsachKhachHangThamGia(maHD);
	}

	public List<KhachHangThamGia> danhSachKhachHangThamGiaTour(String maTour) throws RemoteException {
		return khachHangThamGiaDAO.danhSachKhachHangThamGiaTour(maTour);
	}
	
}
