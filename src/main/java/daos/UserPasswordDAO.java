package daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import database.Database;
import entities.UserPassword;

public class UserPasswordDAO {
	private Connection con;
	private CallableStatement call;
	private ResultSet rs;
	private List<UserPassword> user = new ArrayList<UserPassword>();
	
	public UserPassword dangNhap(String username, String password) {
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.DangNhap(?, ?)}");
			call.setString(1, username);
			call.setString(2, password);
			rs = call.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String pas = rs.getString(2);
				UserPassword userPassword = new UserPassword(id, pas);
				return userPassword;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
