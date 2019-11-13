package entities;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class KhachHang implements Serializable{
	private String maKH;
	private String hoTenKH;
	private String gioiTinh;
	private LocalDate ngaySinh;
	private String cmnd;
	private String email;
	private String soDienThoai;
	private String diaChi;
	/**
	 * @param maKH
	 * @param hoTenKH
	 * @param gioiTinh
	 * @param ngaySinh
	 * @param cmnd
	 * @param email
	 * @param soDienThoai
	 * @param diaChi
	 */
	public KhachHang(String maKH, String hoTenKH, String gioiTinh, LocalDate ngaySinh, String cmnd, String email,
			String soDienThoai, String diaChi) {
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.cmnd = cmnd;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}
	/**
	 * @param maKH
	 */
	public KhachHang(String maKH) {
		this.maKH = maKH;
	}
	/**
	 * 
	 */
	public KhachHang() {
	}
	/**
	 * @return the maKH
	 */
	public String getMaKH() {
		return maKH;
	}
	/**
	 * @param maKH the maKH to set
	 */
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	/**
	 * @return the hoTenKH
	 */
	public String getHoTenKH() {
		return hoTenKH;
	}
	/**
	 * @param hoTenKH the hoTenKH to set
	 */
	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}
	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
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
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", hoTenKH=" + hoTenKH + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh
				+ ", cmnd=" + cmnd + ", email=" + email + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maKH == null) ? 0 : maKH.hashCode());
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
		KhachHang other = (KhachHang) obj;
		if (maKH == null) {
			if (other.maKH != null)
				return false;
		} else if (!maKH.equals(other.maKH))
			return false;
		return true;
	}
	
	
}
