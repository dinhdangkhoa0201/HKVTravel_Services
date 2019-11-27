package entities;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class HuongDanVien implements Serializable{
	private String maHDV;
	private String hoTenHDV;
	private String gioiTinh;
	private LocalDate ngaySinh;
	private String cmnd;
	private String email;
	private String soDienThoai;
	private String diaChi;
	private boolean trangThai;
	private byte[] anh;
	
	/**
	 * @param maHDV
	 * @param hoTenHDV
	 * @param gioiTinh
	 * @param ngaySinh
	 * @param cmnd
	 * @param email
	 * @param soDienThoai
	 * @param diaChi
	 * @param trangThai
	 * @param anh
	 */
	public HuongDanVien(String maHDV, String hoTenHDV, String gioiTinh, LocalDate ngaySinh, String cmnd, String email,
			String soDienThoai, String diaChi, boolean trangThai, byte[] anh) {
		this.maHDV = maHDV;
		this.hoTenHDV = hoTenHDV;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.cmnd = cmnd;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.trangThai = trangThai;
		this.anh = anh;
	}
	/**
	 * @param maHDV
	 */
	public HuongDanVien(String maHDV) {
		this.maHDV = maHDV;
	}
	/**
	 * 
	 */
	public HuongDanVien() {
	}
	/**
	 * @return the maHDV
	 */
	public String getMaHDV() {
		return maHDV;
	}
	/**
	 * @param maHDV the maHDV to set
	 */
	public void setMaHDV(String maHDV) {
		this.maHDV = maHDV;
	}
	/**
	 * @return the hoTenHDV
	 */
	public String getHoTenHDV() {
		return hoTenHDV;
	}
	/**
	 * @param hoTenHDV the hoTenHDV to set
	 */
	public void setHoTenHDV(String hoTenHDV) {
		this.hoTenHDV = hoTenHDV;
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
	/**
	 * @return the trangThai
	 */
	public boolean isTrangThai() {
		return trangThai;
	}
	/**
	 * @param trangThai the trangThai to set
	 */
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	/**
	 * @return the anh
	 */
	public byte[] getAnh() {
		return anh;
	}
	/**
	 * @param anh the anh to set
	 */
	public void setAnh(byte[] anh) {
		this.anh = anh;
	}
	@Override
	public String toString() {
		return "HuongDanVien [maHDV=" + maHDV + ", hoTenHDV=" + hoTenHDV + ", gioiTinh=" + gioiTinh + ", ngaySinh="
				+ ngaySinh + ", cmnd=" + cmnd + ", email=" + email + ", soDienThoai=" + soDienThoai + ", diaChi="
				+ diaChi + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHDV == null) ? 0 : maHDV.hashCode());
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
		HuongDanVien other = (HuongDanVien) obj;
		if (maHDV == null) {
			if (other.maHDV != null)
				return false;
		} else if (!maHDV.equals(other.maHDV))
			return false;
		return true;
	}
	
	
	
}
