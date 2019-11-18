package services.imp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import daos.NhanVienDAO;
import entities.NhanVien;
import entities.UserPassword;
import services.NhanVienServices;

public class NhanVienImp extends UnicastRemoteObject implements NhanVienServices {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NhanVienDAO nhanVienDAO;

	public NhanVienImp() throws RemoteException {
		nhanVienDAO = new NhanVienDAO();
	}

	@Override
	public boolean themNhanVien(NhanVien nhanVien, UserPassword userPassword) throws RemoteException {
		return nhanVienDAO.themNhanVien(nhanVien, userPassword);
	}

	@Override
	public boolean xoaNhanVien(NhanVien nhanVien) throws RemoteException {
		return nhanVienDAO.xoaNhanVien(nhanVien);
	}

	@Override
	public boolean suaNhanVien(NhanVien nhanVien) throws RemoteException {
		return nhanVienDAO.suaNhanVien(nhanVien);
	}

	@Override
	public List<NhanVien> danhsachNhanVien() throws RemoteException {
		return nhanVienDAO.danhsachNhanVien();
	}

	@Override
	public NhanVien dangNhap(String id) throws RemoteException {
		return nhanVienDAO.dangNhap(id);
	}

	@Override
	public boolean dangXuat(NhanVien nhanVien) throws RemoteException {
		return nhanVienDAO.dangXuat(nhanVien);
	}

	@Override
	public List<String> danhSachEmail() throws RemoteException {
		return nhanVienDAO.danhSachEmail();
	}

	@Override
	public List<String> danhSachSDT() throws RemoteException {
		return nhanVienDAO.danhSachSDT();
	}

	@Override
	public List<String> danhSachCMND() throws RemoteException {
		return nhanVienDAO.danhSachCMND();
	}

	@Override
	public boolean capNhatAnhDaiDien(String id, byte[] anh) throws RemoteException {
		return nhanVienDAO.capNhatAnhDaiDien(id, anh);
	}
}
