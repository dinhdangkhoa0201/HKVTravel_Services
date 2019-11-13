package entities;

import java.io.Serializable;
import java.time.LocalDateTime;

@SuppressWarnings("serial")
public class HoaDon implements Serializable{
	private String maHD;
	private Tour tour;
	private NhanVien nhanVien;
	private KhachHang khachHang;
	private LocalDateTime ngayLapHoaDon;
	/**
	 * @param maHD
	 * @param tour
	 * @param nhanVien
	 * @param khachHang
	 * @param ngayLapHoaDon
	 */
	public HoaDon(String maHD, Tour tour, NhanVien nhanVien, KhachHang khachHang, LocalDateTime ngayLapHoaDon) {
		this.maHD = maHD;
		this.tour = tour;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	/**
	 * 
	 */
	public HoaDon() {
	}
	/**
	 * @return the maHD
	 */
	public String getMaHD() {
		return maHD;
	}
	/**
	 * @param maHD the maHD to set
	 */
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	/**
	 * @return the tour
	 */
	public Tour getTour() {
		return tour;
	}
	/**
	 * @param tour the tour to set
	 */
	public void setTour(Tour tour) {
		this.tour = tour;
	}
	/**
	 * @return the nhanVien
	 */
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	/**
	 * @param nhanVien the nhanVien to set
	 */
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	/**
	 * @return the khachHang
	 */
	public KhachHang getKhachHang() {
		return khachHang;
	}
	/**
	 * @param khachHang the khachHang to set
	 */
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	/**
	 * @return the ngayLapHoaDon
	 */
	public LocalDateTime getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	/**
	 * @param ngayLapHoaDon the ngayLapHoaDon to set
	 */
	public void setNgayLapHoaDon(LocalDateTime ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", tour=" + tour + ", nhanVien=" + nhanVien + ", khachHang=" + khachHang
				+ ", ngayLapHoaDon=" + ngayLapHoaDon + "]";
	}
	
}
