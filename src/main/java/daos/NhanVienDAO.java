package daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import database.Database;
import entities.NhanVien;
import entities.UserPassword;

public class NhanVienDAO {
	private Connection con = null;
	private CallableStatement call = null;
	private ResultSet rs;
	private List<NhanVien> danhSachNhanVienOnl = new ArrayList<NhanVien>();
	public boolean themNhanVien(NhanVien nhanVien, UserPassword userPassword) {
		try {	
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.CRUDNhanVien (1, null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
			call.setString(1, nhanVien.getHoTen());
			if(nhanVien.getGioiTinh().equals("Nam"))
				call.setInt(2, 0);
			else if(nhanVien.getGioiTinh().equals("Nữ"))
				call.setInt(2, 1);
			else
				call.setInt(2, -1);
			call.setString(3, nhanVien.getNgaySinh().toString());
			call.setString(4, nhanVien.getNgayVaoLam().toString());
			call.setString(5, nhanVien.getCmnd());;
			call.setString(6, nhanVien.getDiaChi());
			call.setString(7, nhanVien.getEmail());
			call.setString(8, nhanVien.getSoDienThoai());
			call.setInt(9, nhanVien.getChucVu());
			call.setBytes(10, nhanVien.getAnh());
			call.setString(11, userPassword.getPassWord());
			if(call.executeUpdate() > 0)
				return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean xoaNhanVien(NhanVien nhanVien) {
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.CRUDNhanVien(3, ?, null, null, null, null, null, null, null, null, null, null)}");
			call.setString(1, nhanVien.getMaNV());
			if(call.executeUpdate() > 1)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean suaNhanVien(NhanVien nhanVien) {
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.CRUDNhanVien (2, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
			call.setString(1, nhanVien.getMaNV());
			call.setString(2, nhanVien.getHoTen());
			if(nhanVien.getGioiTinh().equals("Nam"))
				call.setInt(3, 0);
			else if(nhanVien.getGioiTinh().equals("Nữ"))
				call.setInt(3, 1);
			else
				call.setInt(3, -1);
			call.setString(4, nhanVien.getNgaySinh().toString());
			call.setString(5, nhanVien.getNgayVaoLam().toString());
			call.setString(6, nhanVien.getCmnd());
			call.setString(7, nhanVien.getDiaChi());
			call.setString(8, nhanVien.getEmail());
			call.setString(9, nhanVien.getSoDienThoai());
			call.setInt(10, nhanVien.getChucVu());
			call.setBytes(11, nhanVien.getAnh());
			call.setString(12, "");
			if(call.executeUpdate() > 0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<NhanVien> danhsachNhanVien() {
		List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.DocBang(?)}");
			call.setString(1, "NhanVien");
			rs = call.executeQuery();
			while(rs.next()) {
				String maNV = rs.getString(1);
				String hoTen = (rs.getString(2) == null) ? "" : rs.getString(2);
				String gioiTinh = "";
				switch (rs.getInt(3)) {
				case 0: gioiTinh = "Nam";
					break;
				case 1: gioiTinh = "Nữ";
					break;
				default: gioiTinh = "";
					break;
				}
				LocalDate ngaySinh = (rs.getDate(4) == null) ? null : rs.getDate(4).toLocalDate(); 
				String diaChi = (rs.getString(5) == null) ? "" : rs.getString(5);
				LocalDate ngayVaoLam = (rs.getDate(6) == null) ? null : rs.getDate(6).toLocalDate();
				String cmnd = (rs.getString(7) == null) ? "" : rs.getString(7);				
				String email = (rs.getString(8) == null) ? "" : rs.getString(8);
				String soDienThoai = (rs.getString(9) == null) ? "" : rs.getString(9);
				int chucVu = (rs.getBoolean(10) == true) ? 1 : 0;
				byte[] anh = (rs.getBytes(11) == null) ? null : rs.getBytes(11);
				NhanVien nhanVien = new NhanVien(maNV, hoTen, gioiTinh, ngaySinh, cmnd.replaceAll("[-]", ""), ngayVaoLam, diaChi, email, soDienThoai.replaceAll("[\\s]", ""), chucVu, anh);
				dsNhanVien.add(nhanVien);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsNhanVien;
	}
	
	public NhanVien dangNhap(String id) {
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.DangNhapNV (?)}");
			call.setString(1, id);
			rs = call.executeQuery();
			while(rs.next()) {
				String maNV = rs.getString(1);
				String hoTen = (rs.getString(2) == null) ? "" : rs.getString(2);
				String gioiTinh = "";
				switch (rs.getInt(3)) {
				case 0: gioiTinh = "Nam";
					break;
				case 1: gioiTinh = "Nữ";
					break;
				default: gioiTinh = "";
					break;
				}
				LocalDate ngaySinh = (rs.getDate(4) == null) ? null : rs.getDate(4).toLocalDate(); 
				String diaChi = (rs.getString(5) == null) ? "" : rs.getString(5);
				LocalDate ngayVaoLam = (rs.getDate(6) == null) ? null : rs.getDate(6).toLocalDate();
				String cmnd = (rs.getString(7) == null) ? "" : rs.getString(7);				
				String email = (rs.getString(8) == null) ? "" : rs.getString(8);
				String soDienThoai = (rs.getString(9) == null) ? "" : rs.getString(9);
				int chucVu = (rs.getBoolean(10) == true) ? 1 : 0;
				byte[] anh = (rs.getBytes(11) == null) ? null : rs.getBytes(11);
				NhanVien nhanVien = new NhanVien(maNV, hoTen, gioiTinh, ngaySinh, cmnd.replaceAll("[-]", ""), ngayVaoLam, diaChi, email, soDienThoai.replaceAll("[\\s]", ""), chucVu, anh);
				if(!danhSachNhanVienOnl.contains(nhanVien)) {
					danhSachNhanVienOnl.add(nhanVien);
					return nhanVien;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}
	
	
	public boolean capNhatAnhDaiDien(String id, byte[] anh) {
		try {
			con = Database.getInStance().getConnection();
			call = con.prepareCall("{call dbo.DoiAnhDaiDien (?, ?)}");
			call.setString(1, id);
			call.setBytes(2, anh);
			if(call.executeUpdate() > 0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean dangXuat(NhanVien nhanVien) {
		if(danhSachNhanVienOnl.contains(nhanVien)) {
			danhSachNhanVienOnl.remove(nhanVien);
			return true;
		}
		return false;
	}
	
	public List<String> danhSachEmail(){
		List<String> listEmail = new ArrayList<String>();
		List<NhanVien> list = danhsachNhanVien();
		list.forEach(x -> {
			if(!listEmail.contains(x.getEmail())) {
				listEmail.add(x.getEmail());
			}
		});
		return listEmail;
	}
	
	public List<String> danhSachSDT(){
		List<String> listSDT = new ArrayList<String>();
		List<NhanVien> list = danhsachNhanVien();
		list.forEach(x -> {
			if(!listSDT.contains(x.getSoDienThoai())) {
				listSDT.add(x.getSoDienThoai().replaceAll("[\\s]", ""));
			}
		});
		return listSDT;
	}
	
	public List<String> danhSachCMND(){
		List<String> listCMND = new ArrayList<String>();
		List<NhanVien> list = danhsachNhanVien();
		list.forEach(x -> {
			if(!listCMND.contains(x.getCmnd())) {
				listCMND.add(x.getCmnd().replaceAll("[-]", ""));
			}
		});
		return listCMND;
	}

}
