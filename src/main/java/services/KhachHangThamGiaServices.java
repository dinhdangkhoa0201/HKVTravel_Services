package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entities.KhachHangThamGia;

public interface KhachHangThamGiaServices extends Remote {
	public boolean themKhachHangThamGia(KhachHangThamGia khachHangThamGia) throws RemoteException;
	public List<KhachHangThamGia> danhsachKhachHangThamGia(String maHD) throws RemoteException;
	public List<KhachHangThamGia> danhSachKhachHangThamGiaTour(String maTour) throws RemoteException;
}
