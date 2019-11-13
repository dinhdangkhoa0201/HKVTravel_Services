package daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import database.Database;
import entities.HuongDanVien;

public class HuongDanVienDAO {
	private Connection con = null;
	private CallableStatement call = null;
	private ResultSet rs;

	public boolean themHuongDanVien(HuongDanVien huongDanVien) {
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.CRUDHuongDanVien (1, null, ?, ?, ?, ?, ?, ?, ?, ?)}");
			call.setString(1, huongDanVien.getHoTenHDV());
			if (huongDanVien.getGioiTinh().equals("Nam"))
				call.setInt(2, 0);
			else if (huongDanVien.getGioiTinh().equals("Nữ"))
				call.setInt(2, 1);
			else
				call.setInt(2, -1);
			call.setString(3, huongDanVien.getNgaySinh().toString());
			call.setString(4, huongDanVien.getDiaChi());
			call.setString(5, huongDanVien.getCmnd());
			call.setString(6, huongDanVien.getEmail());
			call.setString(7, huongDanVien.getSoDienThoai());
			call.setBoolean(8, huongDanVien.isTrangThai());
			if (call.executeUpdate() > 0)
				return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean suaHuongDanVien(HuongDanVien huongDanVien) {
		return false;
	}

	public List<HuongDanVien> danhSachHuongDanVien() {
		List<HuongDanVien> dsHDV = new ArrayList<HuongDanVien>();
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.DocBang(?)}");
			call.setString(1, "HuongDanVien");
			ResultSet rs = call.executeQuery();
			while (rs.next()) {
				String maHDV = rs.getString(1);
				String hoTen = (rs.getString(2)) == null ? "" : rs.getString(2);
				String gioiTinh = "";
				switch (rs.getInt(3)) {
				case 0:
					gioiTinh = "Nam";
					break;
				case 1:
					gioiTinh = "Nữ";
					break;
				default:
					gioiTinh = "";
					break;
				}
				LocalDate ngaySinh = (rs.getDate(4) == null) ? null : rs.getDate(4).toLocalDate();
				String diaChi = (rs.getString(5) == null) ? "" : rs.getString(5);
				String cmnd = (rs.getString(6) == null) ? "" : rs.getString(6);
				String email = (rs.getString(7) == null) ? "" : rs.getString(7);
				String dienThoai = (rs.getString(8) == null) ? "" : rs.getString(8);
				boolean trangThai = rs.getBoolean(9);
				HuongDanVien huongDanVien = new HuongDanVien(maHDV, hoTen, gioiTinh, ngaySinh, cmnd, email, dienThoai, diaChi, trangThai);
				dsHDV.add(huongDanVien);
			}
			return dsHDV;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
