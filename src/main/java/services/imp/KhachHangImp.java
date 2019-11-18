package services.imp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import daos.KhachHangDAO;
import entities.KhachHang;
import entities.UserPassword;
import services.KhachHangServices;

public class KhachHangImp extends UnicastRemoteObject implements KhachHangServices {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private KhachHangDAO khachHangDAO;

	public KhachHangImp() throws RemoteException {
		super();
		khachHangDAO = new KhachHangDAO();
	}

	@Override
	public boolean themKhachHang(KhachHang khachHang, UserPassword userPassword) throws RemoteException {
		return khachHangDAO.themKhachHang(khachHang, userPassword);
	}

	@Override
	public boolean xoaKhachHang(KhachHang khachHang) throws RemoteException {
		return khachHangDAO.xoaKhachHang(khachHang);
	}

	@Override
	public int suaKhachHang(KhachHang khachHang) throws RemoteException {
		return khachHangDAO.suaKhachHang(khachHang);
	}
	
	@Override
	public List<KhachHang> danhsachKhachHang() throws RemoteException {
		return khachHangDAO.danhsachKhachHang();
	}
	
	@Override
	public KhachHang dangNhap(String id) throws RemoteException {
		return khachHangDAO.dangNhap(id);
	}
	
	@Override
	public boolean dangXuat(KhachHang khachHang) throws RemoteException {
		return khachHangDAO.dangXuat(khachHang);
	}
	
	@Override
	public List<String> danhSachEmail() throws RemoteException {
		return khachHangDAO.danhSachEmail();
	}

	@Override
	public List<String> danhSachSDT() throws RemoteException {
		return khachHangDAO.danhSachSDT();
	}

	@Override
	public List<String> danhSachCMND() throws RemoteException {
		return khachHangDAO.danhSachCMND();
	}

}
