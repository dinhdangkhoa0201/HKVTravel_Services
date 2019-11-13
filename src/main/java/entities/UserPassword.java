package entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserPassword implements Serializable{
	private String id;
	private String passWord;
	/**
	 * @param id
	 * @param passWord
	 */
	public UserPassword(String id, String passWord) {
		this.id = id;
		this.passWord = passWord;
	}
	/**
	 * 
	 */
	public UserPassword() {
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "UserPassword [id=" + id + ", passWord=" + passWord + "]";
	}
	
}
