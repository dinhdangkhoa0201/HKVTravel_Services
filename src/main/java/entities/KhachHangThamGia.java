package entities;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class KhachHangThamGia implements Serializable{
	private String maKhachHangThamGia;
	private String maHoaDon;
	private String tenKhachHangThamGia;
	private String gioiTinh;
	private String cmnd;
	private LocalDate ngaySinh;
	private String diaChi;
	private String donGia;
	/**
	 * @param maKhachHangThamGia
	 * @param maHoaDon
	 * @param tenKhachHangThamGia
	 * @param gioiTinh
	 * @param cmnd
	 * @param ngaySinh
	 * @param diaChi
	 * @param donGia
	 */
	public KhachHangThamGia(String maKhachHangThamGia, String maHoaDon, String tenKhachHangThamGia, String gioiTinh,
			String cmnd, LocalDate ngaySinh, String diaChi, String donGia) {
		this.maKhachHangThamGia = maKhachHangThamGia;
		this.maHoaDon = maHoaDon;
		this.tenKhachHangThamGia = tenKhachHangThamGia;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.donGia = donGia;
	}
	/**
	 * @param maKhachHangThamGia
	 */
	public KhachHangThamGia(String maKhachHangThamGia) {
		this.maKhachHangThamGia = maKhachHangThamGia;
	}
	/**
	 * 
	 */
	public KhachHangThamGia() {
	}
	/**
	 * @return the maKhachHangThamGia
	 */
	public String getMaKhachHangThamGia() {
		return maKhachHangThamGia;
	}
	/**
	 * @param maKhachHangThamGia the maKhachHangThamGia to set
	 */
	public void setMaKhachHangThamGia(String maKhachHangThamGia) {
		this.maKhachHangThamGia = maKhachHangThamGia;
	}
	/**
	 * @return the maHoaDon
	 */
	public String getMaHoaDon() {
		return maHoaDon;
	}
	/**
	 * @param maHoaDon the maHoaDon to set
	 */
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	/**
	 * @return the tenKhachHangThamGia
	 */
	public String getTenKhachHangThamGia() {
		return tenKhachHangThamGia;
	}
	/**
	 * @param tenKhachHangThamGia the tenKhachHangThamGia to set
	 */
	public void setTenKhachHangThamGia(String tenKhachHangThamGia) {
		this.tenKhachHangThamGia = tenKhachHangThamGia;
	}
	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}
	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	/**
	 * @return the cmnd
	 */
	public String getCmnd() {
		return cmnd;
	}
	/**
	 * @param cmnd the cmnd to set
	 */
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	/**
	 * @return the ngaySinh
	 */
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	/**
	 * @param ngaySinh the ngaySinh to set
	 */
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}
	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	/**
	 * @return the donGia
	 */
	public String getDonGia() {
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(String donGia) {
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		return "KhachHangThamGia [maKhachHangThamGia=" + maKhachHangThamGia + ", maHoaDon=" + maHoaDon
				+ ", tenKhachHangThamGia=" + tenKhachHangThamGia + ", gioiTinh=" + gioiTinh + ", cmnd=" + cmnd
				+ ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", donGia=" + donGia + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maKhachHangThamGia == null) ? 0 : maKhachHangThamGia.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHangThamGia other = (KhachHangThamGia) obj;
		if (maKhachHangThamGia == null) {
			if (other.maKhachHangThamGia != null)
				return false;
		} else if (!maKhachHangThamGia.equals(other.maKhachHangThamGia))
			return false;
		return true;
	}
	
	
}
