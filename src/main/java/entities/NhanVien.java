package entities;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class NhanVien implements Serializable{
	private String maNV;
	private String hoTen;
	private String gioiTinh;
	private LocalDate ngaySinh;
	private String cmnd;
	private LocalDate ngayVaoLam;
	private String diaChi;
	private String email;
	private String soDienThoai;
	private int chucVu;
	/**
	 * @param maNV
	 * @param hoTen
	 * @param gioiTinh
	 * @param ngaySinh
	 * @param cmnd
	 * @param ngayVaoLam
	 * @param diaChi
	 * @param email
	 * @param soDienThoai
	 * @param chucVu
	 * @param tongThu
	 */
	public NhanVien(String maNV, String hoTen, String gioiTinh, LocalDate ngaySinh, String cmnd, LocalDate ngayVaoLam,
			String diaChi, String email, String soDienThoai, int chucVu) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.cmnd = cmnd;
		this.ngayVaoLam = ngayVaoLam;
		this.diaChi = diaChi;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.chucVu = chucVu;
	}
	
	/**
	 * @param maNV
	 */
	public NhanVien(String maNV) {
		this.maNV = maNV;
	}

	/**
	 * 
	 */
	public NhanVien() {
	}
	/**
	 * @return the maNV
	 */
	public String getMaNV() {
		return maNV;
	}
	/**
	 * @param maNV the maNV to set
	 */
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}
	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
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
	 * @return the ngayVaoLam
	 */
	public LocalDate getNgayVaoLam() {
		return ngayVaoLam;
	}
	/**
	 * @param ngayVaoLam the ngayVaoLam to set
	 */
	public void setNgayVaoLam(LocalDate ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
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
	 * @return the chucVu
	 */
	public int getChucVu() {
		return chucVu;
	}
	/**
	 * @param chucVu the chucVu to set
	 */
	public void setChucVu(int chucVu) {
		this.chucVu = chucVu;
	}
	/**
	 * @return the tongThu
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maNV == null) ? 0 : maNV.hashCode());
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
		NhanVien other = (NhanVien) obj;
		if (maNV == null) {
			if (other.maNV != null)
				return false;
		} else if (!maNV.equals(other.maNV))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh
				+ ", cmnd=" + cmnd + ", ngayVaoLam=" + ngayVaoLam + ", diaChi=" + diaChi + ", email=" + email
				+ ", soDienThoai=" + soDienThoai + ", chucVu=" + chucVu + "]";
	}
	
	
}
