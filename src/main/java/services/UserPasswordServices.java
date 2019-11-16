package services;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entities.UserPassword;

public interface UserPasswordServices extends Remote {
	public UserPassword timUserPassword(String username, String password) throws RemoteException;
	boolean doiMatKhau(UserPassword userPassword) throws RemoteException;
}
