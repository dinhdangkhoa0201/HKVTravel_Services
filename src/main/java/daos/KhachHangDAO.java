package daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import database.Database;
import entities.KhachHang;
import entities.NhanVien;
import entities.UserPassword;

public class KhachHangDAO {
	private Connection con;
	private CallableStatement call;
	private ResultSet rs;
	private List<KhachHang> danhSachKhachHangOnl = new ArrayList<KhachHang>();
	public KhachHangDAO() {
		con = Database.getInStance().getConnection();
	}

	public boolean themKhachHang(KhachHang khachHang, UserPassword userPassword) {
		try {
			
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.CRUDKhachHang(1, null, ?, ?, ?, ?, ?, ?, ?, ?)}");
			call.setString(1, khachHang.getHoTenKH());
			System.out.println("Thêm kh "+khachHang);
			if(khachHang.getGioiTinh().equals("Nam"))
				call.setInt(2, 0);
			else if(khachHang.getGioiTinh().equals("Nữ"))
				call.setInt(2, 1);
			else if(khachHang.getGioiTinh().equals(""))
				call.setInt(2, -1);
			call.setString(3, (khachHang.getNgaySinh() == null) ? "" : khachHang.getNgaySinh().toString());
			call.setString(4, (khachHang.getDiaChi() == null) ? "" : khachHang.getDiaChi());
			call.setString(5, (khachHang.getCmnd() == null) ? "" : khachHang.getCmnd());
			call.setString(6, khachHang.getEmail());
			call.setString(7, khachHang.getSoDienThoai());
			call.setString(8, userPassword.getPassWord());
			int flag = call.executeUpdate();
			if(flag > 0)
				return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean xoaKhachHang(KhachHang khachHang) {
		return false;
	}

	public int suaKhachHang(KhachHang khachHang) {
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.CRUDKhachHang(2, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
			call.setString(1, khachHang.getMaKH());
			call.setString(2, khachHang.getHoTenKH());
			if(khachHang.getGioiTinh().equals("Nam"))
				call.setInt(3, 0);
			else if(khachHang.getGioiTinh().equals("Nữ"))
				call.setInt(3, 1);
			else
				call.setInt(3, -1);
			call.setString(4, (khachHang.getNgaySinh().toString() == null) ? "" : khachHang.getNgaySinh().toString());
			call.setString(5, (khachHang.getDiaChi() == null) ? "" : khachHang.getDiaChi());
			call.setString(6, (khachHang.getCmnd() == null) ? "" : khachHang.getCmnd());
			call.setString(7, khachHang.getEmail());
			call.setString(8, khachHang.getSoDienThoai()); 
			call.setString(9, ""); 
			return call.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return -1;
	}

	public List<KhachHang> danhsachKhachHang() {
		List<KhachHang> dsKhachHang = new ArrayList<KhachHang>();
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.DocBang (?)}");
			call.setString(1, "KhachHang");
			ResultSet rs = call.executeQuery();
			while(rs.next()) {
				String maKH = (rs.getString(1) == null) ? "" : rs.getString(1);
				String hoTen = (rs.getString(2) == null) ? "" : rs.getString(2);
				String gioiTinh = "";
				switch (rs.getInt(3)) {
				case 0:
					gioiTinh = "Nam";
					break;
				case 1:
					gioiTinh = "Nữ";
				default:
					gioiTinh = "";
					break;
				}
				LocalDate ngaySinh = (rs.getDate(4) == null) ? null : rs.getDate(4).toLocalDate();
				String diaChi = (rs.getString(5) == null) ? "" : rs.getString(5);
				String cmnd = (rs.getString(6) == null) ? "" : rs.getString(6);
				String email = (rs.getString(7) == null) ? "" : rs.getString(7);
				String soDienThoai = (rs.getString(8) == null) ? "" : rs.getString(8);
				KhachHang khachHang = new KhachHang(maKH, hoTen, gioiTinh, ngaySinh, cmnd.replaceAll("[-]", ""), email, soDienThoai.replaceAll("[\\s]", ""), diaChi);
				dsKhachHang.add(khachHang);
			}
			return dsKhachHang;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public KhachHang dangNhap(String id) {
		try {
			con = Database.getInStance().getConnection();
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.DangNhapKH (?)}");
			call.setString(1, id);
			rs = call.executeQuery();
			while(rs.next()) {
				String maKH = (rs.getString(1) == null) ? "" : rs.getString(1);
				String hoTen = (rs.getString(2) == null) ? "" : rs.getString(2);
				String gioiTinh = "";
				switch (rs.getInt(3)) {
				case 0:
					gioiTinh = "Nam";
					break;
				case 1:
					gioiTinh = "Nữ";
				default:
					gioiTinh = "";
					break;
				}
				LocalDate ngaySinh = (rs.getDate(4) == null) ? null : rs.getDate(4).toLocalDate();
				String diaChi = (rs.getString(5) == null) ? "" : rs.getString(5);
				String cmnd = (rs.getString(6) == null) ? "" : rs.getString(6);
				String email = (rs.getString(7) == null) ? "" : rs.getString(7);
				String soDienThoai = (rs.getString(8) == null) ? "" : rs.getString(8);
				KhachHang khachHang = new KhachHang(maKH, hoTen, gioiTinh, ngaySinh, cmnd.replaceAll("[-]", ""), email, soDienThoai.replaceAll("[\\s]", ""), diaChi);
				System.out.println("Khách Hàng đăng nhập : "+khachHang);
				if(!danhSachKhachHangOnl.contains(khachHang)) {
					danhSachKhachHangOnl.add(khachHang);
					System.out.println(danhSachKhachHangOnl);
					return khachHang;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}
	
	public boolean dangXuat(KhachHang khachHang) {
		if(danhSachKhachHangOnl.contains(khachHang)) {
			return danhSachKhachHangOnl.remove(khachHang);
		}
		return false;
	}
	
	public List<String> danhSachEmail(){
		List<String> listEmail = new ArrayList<>();
		List<KhachHang> list = danhsachKhachHang();
		list.forEach(x -> {
			if(!listEmail.contains(x.getEmail())) {
				listEmail.add(x.getEmail());
			}
		});
		return listEmail;
	}
	
	public List<String> danhSachSDT(){
		List<String> listSDT = new ArrayList<>();
		List<KhachHang> list = danhsachKhachHang();
		list.forEach(x -> {
			if(!listSDT.contains(x.getSoDienThoai())) {
				listSDT.add(x.getSoDienThoai().replaceAll("\\s", ""));
			}
		});
		return listSDT;
	}
}
