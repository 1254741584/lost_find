package com.yc.bean;

import java.io.Serializable;

public class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String residential_address;
	private String password;
	private String email_address;
	private Integer phone;
	private String WeChat;
	private String QQ;
	private String sex;
	private Integer create_time;
	private Integer update_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResidential_address() {
		return residential_address;
	}

	public void setResidential_address(String residential_address) {
		this.residential_address = residential_address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getWeChat() {
		return WeChat;
	}

	public void setWeChat(String weChat) {
		WeChat = weChat;
	}

	public String getQQ() {
		return QQ;
	}

	public void setQQ(String qQ) {
		QQ = qQ;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Integer create_time) {
		this.create_time = create_time;
	}

	public Integer getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Integer update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name
				+ ", residential_address=" + residential_address
				+ ", password=" + password + ", email_address=" + email_address
				+ ", phone=" + phone + ", WeChat=" + WeChat + ", QQ=" + QQ
				+ ", sex=" + sex + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((QQ == null) ? 0 : QQ.hashCode());
		result = prime * result + ((WeChat == null) ? 0 : WeChat.hashCode());
		result = prime * result
				+ ((create_time == null) ? 0 : create_time.hashCode());
		result = prime * result
				+ ((email_address == null) ? 0 : email_address.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime
				* result
				+ ((residential_address == null) ? 0 : residential_address
						.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result
				+ ((update_time == null) ? 0 : update_time.hashCode());
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
		Account other = (Account) obj;
		if (QQ == null) {
			if (other.QQ != null)
				return false;
		} else if (!QQ.equals(other.QQ))
			return false;
		if (WeChat == null) {
			if (other.WeChat != null)
				return false;
		} else if (!WeChat.equals(other.WeChat))
			return false;
		if (create_time == null) {
			if (other.create_time != null)
				return false;
		} else if (!create_time.equals(other.create_time))
			return false;
		if (email_address == null) {
			if (other.email_address != null)
				return false;
		} else if (!email_address.equals(other.email_address))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (residential_address == null) {
			if (other.residential_address != null)
				return false;
		} else if (!residential_address.equals(other.residential_address))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (update_time == null) {
			if (other.update_time != null)
				return false;
		} else if (!update_time.equals(other.update_time))
			return false;
		return true;
	}

	public Account(Integer id, String name, String residential_address,
			String password, String email_address, Integer phone,
			String weChat, String qQ, String sex, Integer create_time,
			Integer update_time) {
		super();
		this.id = id;
		this.name = name;
		this.residential_address = residential_address;
		this.password = password;
		this.email_address = email_address;
		this.phone = phone;
		WeChat = weChat;
		QQ = qQ;
		this.sex = sex;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public Account() {
		super();
	}
	
	
	
}
