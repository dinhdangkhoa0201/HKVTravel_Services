package daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import database.Database;
import entities.ChiTietTour;
import entities.HuongDanVien;
import entities.Tour;

public class TourDAO {
	private Connection con;
	private CallableStatement call;

	public boolean themTour(Tour tour, ChiTietTour chiTietTour) {
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.CRUDTour(1, null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
			call.setString(1, tour.getTenTour());
			call.setString(2, tour.getNoiDi());
			call.setString(3, tour.getNoiDen());
			call.setString(4, tour.getNgayKhoiHanh().toString());
			call.setString(5, tour.getNgayKetThuc().toString());
			call.setString(6, tour.getGioKhoiHanh().toString());
			call.setString(7, tour.getPhuongTien());
			call.setBoolean(8, tour.isHienThi());
			call.setString(9, tour.getGiaVe());
			call.setString(10, tour.getHuongDanVien().getMaHDV());
			call.setBytes(11, tour.getAnh());
			call.setInt(12, tour.getSoLuongHanhKhach());
			call.setString(13, chiTietTour.getMoTa());
			call.setString(14, chiTietTour.getLichTrinh());
			call.setString(15, chiTietTour.getGhiChu());
			call.setString(16, chiTietTour.getAnh());
			if (call.executeUpdate() > 0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean xoaTour(Tour tour) {
		return false;
	}
	
	public boolean suaTour(Tour tour, ChiTietTour chiTietTour) {
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.CRUDTour(2, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
			call.setString(1, tour.getMaTour());
			call.setString(2, tour.getTenTour());
			call.setString(3, tour.getNoiDi());
			call.setString(4, tour.getNoiDen());
			call.setString(5, tour.getNgayKhoiHanh().toString());
			call.setString(6, tour.getNgayKetThuc().toString());
			call.setString(7, tour.getGioKhoiHanh().toString());
			call.setString(8, tour.getPhuongTien());
			call.setBoolean(9, tour.isHienThi());
			call.setString(10, tour.getGiaVe());
			call.setString(11, tour.getHuongDanVien().getMaHDV());
			call.setBytes(12, tour.getAnh());
			call.setInt(13, tour.getSoLuongHanhKhach());
			call.setString(14, chiTietTour.getMoTa());
			call.setString(15, chiTietTour.getLichTrinh());
			call.setString(16, chiTietTour.getGhiChu());
			call.setString(17, chiTietTour.getAnh());
			if (call.executeUpdate() > 0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Tour> danhsachTour(){
		List<Tour> dsTour = new ArrayList<Tour>();
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.DocBang (?)}");
			call.setString(1, "Tour");
			
			ResultSet rs = call.executeQuery();
			while (rs.next() != false) {
				String maTour = rs.getString(1);
				String tenTour = rs.getString(2);
				String noiDi = rs.getString(3);
				String noiDen = rs.getString(4);
				LocalDate ngayKhoiHanh = rs.getDate(5).toLocalDate();
				LocalDate ngayKetThuc = rs.getDate(6).toLocalDate();
				LocalTime gioKhoiHanh = rs.getTime(7).toLocalTime();
				String phuongTien = rs.getString(8);
				boolean hienThi = rs.getBoolean(9);
				String[] giaVe = rs.getString(10).split("[.]");
				System.out.println(giaVe);
				String maHDV = rs.getString(11);
				byte[] anh = rs.getBytes(12);
				int soLuongHanhKhach = rs.getInt(13);
				Tour tour = new Tour(maTour, tenTour, noiDi, noiDen, ngayKhoiHanh, ngayKetThuc, gioKhoiHanh, phuongTien, giaVe[0], hienThi, anh, soLuongHanhKhach, new HuongDanVien(maHDV));
				dsTour.add(tour);
			}
			return dsTour;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
