package services.imp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import daos.UserPasswordDAO;
import entities.UserPassword;
import services.UserPasswordServices;

public class UserPasswordImp extends UnicastRemoteObject implements UserPasswordServices{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserPasswordDAO userPasswordDAO;
	public UserPasswordImp() throws RemoteException{
		userPasswordDAO = new UserPasswordDAO();
	}
	public UserPassword timUserPassword(String username, String password) throws RemoteException {
		return userPasswordDAO.dangNhap(username, password);
	}
	public Object dangNhap(String user, String password) throws RemoteException {
		return null;
	}
}
