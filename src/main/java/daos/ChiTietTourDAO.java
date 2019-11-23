package daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import database.Database;
import entities.ChiTietTour;

public class ChiTietTourDAO {
	private Connection con;
	private CallableStatement call;

	public ChiTietTour timChiTietTour(String maTour) {
		ChiTietTour chiTietTour = null;
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.TimChiTietTour(?)}");
			call.setString(1, maTour);
			ResultSet rs = call.executeQuery();
			while(rs.next()) {
				String moTa = (rs.getString(2) == null) ? "" : rs.getString(1);
				String lichTrinh = (rs.getString(3) == null) ? "" : rs.getString(2);
				String ghiChu = (rs.getString(4) == null) ? "" : rs.getString(3);
				String anh = (rs.getString(5) == null) ? "" : rs.getString(5);
				chiTietTour = new ChiTietTour(maTour, moTa, lichTrinh, ghiChu, anh);
			}
			return chiTietTour;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
