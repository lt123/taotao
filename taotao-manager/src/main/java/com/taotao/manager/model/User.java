package com.taotao.manager.model;

import java.util.Date;

/**
 * ClassName:User
 * Function: TODO
 * Reason:   TODO
 * Date:     2016-5-23 上午10:20:42
 * @author   litao
 * @version  V1.0  
 * @see       
 */
public class User {
	private Long id;
	private String username;
	private String password;
	private String phone;
	private String email;
	private Date createDate;
	private Date updateDate;
	//密码加盐字段
	private String salt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", phone=" + phone + ", email=" + email
				+ ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", salt=" + salt + "]";
	}
	
}
  