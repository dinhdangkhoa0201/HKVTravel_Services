package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entities.KhachHang;
import entities.UserPassword;

public interface KhachHangServices extends Remote{
	public boolean themKhachHang(KhachHang khachHang, UserPassword userPassword) throws RemoteException;
	public boolean xoaKhachHang(KhachHang khachHang) throws RemoteException;
	public int suaKhachHang(KhachHang khachHang) throws RemoteException;
	public List<KhachHang> danhsachKhachHang() throws RemoteException;
	public KhachHang dangNhap(String id) throws RemoteException;
	public boolean dangXuat(KhachHang khachHang) throws RemoteException;
	public List<String> danhSachEmail() throws RemoteException;
	public List<String> danhSachSDT() throws RemoteException;
	public List<String> danhSachCMND() throws RemoteException;
}
