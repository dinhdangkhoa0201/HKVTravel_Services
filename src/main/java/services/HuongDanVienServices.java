package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entities.HuongDanVien;

public interface HuongDanVienServices extends Remote {
	public boolean themHuongDanVien(HuongDanVien huongDanVien) throws RemoteException;
	public boolean suaHuongDanVien(HuongDanVien huongDanVien) throws RemoteException;
	public List<HuongDanVien> danhSachHuongDanVien() throws RemoteException;
}
