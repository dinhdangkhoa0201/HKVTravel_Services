package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entities.NhanVien;
import entities.UserPassword;

public interface NhanVienServices extends Remote{
	public boolean themNhanVien(NhanVien nhanVien, UserPassword userPassword) throws  RemoteException;
	public boolean xoaNhanVien(NhanVien nhanVien) throws RemoteException;
	public boolean suaNhanVien(NhanVien nhanVien) throws RemoteException;
	public List<NhanVien> danhsachNhanVien() throws RemoteException;
	public NhanVien dangNhap(String ID) throws RemoteException;
	public boolean dangXuat(NhanVien nhanVien) throws RemoteException;
	public List<String> danhSachEmail() throws RemoteException;
	public List<String> danhSachSDT() throws RemoteException;
	public List<String> danhSachCMND() throws RemoteException;
	public boolean capNhatAnhDaiDien(String id, byte[] anh) throws RemoteException;
}
