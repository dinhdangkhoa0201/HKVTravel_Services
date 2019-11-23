package entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@SuppressWarnings("serial")
public class Tour implements Serializable{
	private String maTour;
	private String tenTour;
	private String noiDi;
	private String noiDen;
	private LocalDate ngayKhoiHanh;
	private LocalDate ngayKetThuc;
	private LocalTime gioKhoiHanh;
	private String phuongTien;
	private String giaVe;
	private boolean hienThi;
	private byte[] anh;
	private int soLuongHanhKhach;
	private HuongDanVien huongDanVien;
	
	/**
	 * @param maTour
	 * @param tenTour
	 * @param noiDi
	 * @param noiDen
	 * @param ngayKhoiHanh
	 * @param ngayKetThuc
	 * @param gioKhoiHanh
	 * @param phuongTien
	 * @param giaVe
	 * @param hienThi
	 * @param anh
	 * @param soLuongHanhKhach
	 * @param huongDanVien
	 */
	public Tour(String maTour, String tenTour, String noiDi, String noiDen, LocalDate ngayKhoiHanh,
			LocalDate ngayKetThuc, LocalTime gioKhoiHanh, String phuongTien, String giaVe, boolean hienThi, byte[] anh,
			int soLuongHanhKhach, HuongDanVien huongDanVien) {
		this.maTour = maTour;
		this.tenTour = tenTour;
		this.noiDi = noiDi;
		this.noiDen = noiDen;
		this.ngayKhoiHanh = ngayKhoiHanh;
		this.ngayKetThuc = ngayKetThuc;
		this.gioKhoiHanh = gioKhoiHanh;
		this.phuongTien = phuongTien;
		this.giaVe = giaVe;
		this.hienThi = hienThi;
		this.anh = anh;
		this.soLuongHanhKhach = soLuongHanhKhach;
		this.huongDanVien = huongDanVien;
	}
	/**
	 * @param maTour
	 */
	public Tour(String maTour) {
		this.maTour = maTour;
	}
	/**
	 * 
	 */
	public Tour() {
	}
	/**
	 * @return the maTour
	 */
	public String getMaTour() {
		return maTour;
	}
	/**
	 * @param maTour the maTour to set
	 */
	public void setMaTour(String maTour) {
		this.maTour = maTour;
	}
	/**
	 * @return the tenTour
	 */
	public String getTenTour() {
		return tenTour;
	}
	/**
	 * @param tenTour the tenTour to set
	 */
	public void setTenTour(String tenTour) {
		this.tenTour = tenTour;
	}
	/**
	 * @return the noiDi
	 */
	public String getNoiDi() {
		return noiDi;
	}
	/**
	 * @param noiDi the noiDi to set
	 */
	public void setNoiDi(String noiDi) {
		this.noiDi = noiDi;
	}
	/**
	 * @return the noiDen
	 */
	public String getNoiDen() {
		return noiDen;
	}
	/**
	 * @param noiDen the noiDen to set
	 */
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	/**
	 * @return the ngayKhoiHanh
	 */
	public LocalDate getNgayKhoiHanh() {
		return ngayKhoiHanh;
	}
	/**
	 * @param ngayKhoiHanh the ngayKhoiHanh to set
	 */
	public void setNgayKhoiHanh(LocalDate ngayKhoiHanh) {
		this.ngayKhoiHanh = ngayKhoiHanh;
	}
	/**
	 * @return the ngayKetThuc
	 */
	public LocalDate getNgayKetThuc() {
		return ngayKetThuc;
	}
	/**
	 * @param ngayKetThuc the ngayKetThuc to set
	 */
	public void setNgayKetThuc(LocalDate ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	/**
	 * @return the gioKhoiHanh
	 */
	public LocalTime getGioKhoiHanh() {
		return gioKhoiHanh;
	}
	/**
	 * @param gioKhoiHanh the gioKhoiHanh to set
	 */
	public void setGioKhoiHanh(LocalTime gioKhoiHanh) {
		this.gioKhoiHanh = gioKhoiHanh;
	}
	/**
	 * @return the phuongTien
	 */
	public String getPhuongTien() {
		return phuongTien;
	}
	/**
	 * @param phuongTien the phuongTien to set
	 */
	public void setPhuongTien(String phuongTien) {
		this.phuongTien = phuongTien;
	}
	/**
	 * @return the giaVe
	 */
	public String getGiaVe() {
		return giaVe;
	}
	/**
	 * @param giaVe the giaVe to set
	 */
	public void setGiaVe(String giaVe) {
		this.giaVe = giaVe;
	}
	/**
	 * @return the hienThi
	 */
	public boolean isHienThi() {
		return hienThi;
	}
	/**
	 * @param hienThi the hienThi to set
	 */
	public void setHienThi(boolean hienThi) {
		this.hienThi = hienThi;
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
	/**
	 * @return the soLuongHanhKhach
	 */
	public int getSoLuongHanhKhach() {
		return soLuongHanhKhach;
	}
	/**
	 * @param soLuongHanhKhach the soLuongHanhKhach to set
	 */
	public void setSoLuongHanhKhach(int soLuongHanhKhach) {
		this.soLuongHanhKhach = soLuongHanhKhach;
	}
	/**
	 * @return the huongDanVien
	 */
	public HuongDanVien getHuongDanVien() {
		return huongDanVien;
	}
	/**
	 * @param huongDanVien the huongDanVien to set
	 */
	public void setHuongDanVien(HuongDanVien huongDanVien) {
		this.huongDanVien = huongDanVien;
	}
	@Override
	public String toString() {
		return "Tour [maTour=" + maTour + ", tenTour=" + tenTour + ", noiDi=" + noiDi + ", noiDen=" + noiDen
				+ ", ngayKhoiHanh=" + ngayKhoiHanh + ", ngayKetThuc=" + ngayKetThuc + ", gioKhoiHanh=" + gioKhoiHanh
				+ ", phuongTien=" + phuongTien + ", giaVe=" + giaVe + ", hienThi=" + hienThi + ", anh=" + anh
				+ ", soLuongHanhKhach=" + soLuongHanhKhach + ", huongDanVien=" + huongDanVien + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maTour == null) ? 0 : maTour.hashCode());
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
		Tour other = (Tour) obj;
		if (maTour == null) {
			if (other.maTour != null)
				return false;
		} else if (!maTour.equals(other.maTour))
			return false;
		return true;
	}
	
}
