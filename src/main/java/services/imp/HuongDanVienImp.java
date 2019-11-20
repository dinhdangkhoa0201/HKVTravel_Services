package services.imp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import daos.HuongDanVienDAO;
import entities.HuongDanVien;
import services.HuongDanVienServices;

public class HuongDanVienImp extends UnicastRemoteObject implements HuongDanVienServices{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HuongDanVienDAO huongDanVienDAO;
	public HuongDanVienImp() throws RemoteException{
		huongDanVienDAO = new HuongDanVienDAO();
	}
	@Override
	public boolean themHuongDanVien(HuongDanVien huongDanVien) throws RemoteException {
		return huongDanVienDAO.themHuongDanVien(huongDanVien);
	}
	@Override
	public boolean suaHuongDanVien(HuongDanVien huongDanVien) throws RemoteException {
		return huongDanVienDAO.suaHuongDanVien(huongDanVien);
	}
	@Override
	public List<HuongDanVien> danhSachHuongDanVien() throws RemoteException {
		return huongDanVienDAO.danhSachHuongDanVien();
	}
	@Override
	public boolean capNhatAnhDaiDien(String id, byte[] anh) throws RemoteException {
		return huongDanVienDAO.capNhatAnhDaiDien(id, anh);
	}

}
