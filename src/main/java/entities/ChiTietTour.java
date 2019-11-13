package entities;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class ChiTietTour implements Serializable{
	private String maTour;
	private String moTa;
	private String lichTrinh;
	private String ghiChu;
	private byte[] anh;
	/**
	 * @param maTour
	 * @param moTa
	 * @param lichTrinh
	 * @param ghiChu
	 * @param anh
	 */
	public ChiTietTour(String maTour, String moTa, String lichTrinh, String ghiChu, byte[] anh) {
		this.maTour = maTour;
		this.moTa = moTa;
		this.lichTrinh = lichTrinh;
		this.ghiChu = ghiChu;
		this.anh = anh;
	}
	/**
	 * 
	 */
	public ChiTietTour() {
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
	 * @return the moTa
	 */
	public String getMoTa() {
		return moTa;
	}
	/**
	 * @param moTa the moTa to set
	 */
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	/**
	 * @return the lichTrinh
	 */
	public String getLichTrinh() {
		return lichTrinh;
	}
	/**
	 * @param lichTrinh the lichTrinh to set
	 */
	public void setLichTrinh(String lichTrinh) {
		this.lichTrinh = lichTrinh;
	}
	/**
	 * @return the ghiChu
	 */
	public String getGhiChu() {
		return ghiChu;
	}
	/**
	 * @param ghiChu the ghiChu to set
	 */
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
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
		return "ChiTietTour [maTour=" + maTour + ", moTa=" + moTa + ", lichTrinh=" + lichTrinh + ", ghiChu=" + ghiChu
				+ ", anh=" + Arrays.toString(anh) + "]";
	}
	
}
